package mc.apps.junit5;

import mc.apps.mocks.Article;
import mc.apps.mocks.DummyRepository;
import mc.apps.mocks.DummyService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockitoInjectTests {
    private final Logger logger = LoggerFactory.getLogger(MockitoInjectTests.class);

    @InjectMocks
    DummyService service;

    @Mock
    DummyRepository repository;

    @Test
    public void ArticleServiceTests(){
        assertNotNull(service);

        assertEquals(true, service.isOk()); // injection (repository) ok!

        List<Article> items = Arrays.asList(
                new Article(1,"Galaxy S10e",999.99f,"cool","s10e.png"),
                new Article(2,"Galaxy S10+",1099.99f,"cool+","s10.png")
        );

        when(repository.findAll()).thenReturn(items);

        logger.info("list : "+service.list());
        assertEquals(2, service.list().size());


//      when(repository.info()).thenReturn("repo");
        when(repository.info()).thenCallRealMethod();

        assertEquals("repo", service.info());
        logger.info("info : "+service.info());

    }
}
