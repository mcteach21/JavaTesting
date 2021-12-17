package mc.apps.junit5;

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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockitoInjectTests {
    @Mock
    private DummyRepository dummyRepository;
    private AutoCloseable closeable;

    @InjectMocks
    private DummyService dummyService;

    @BeforeEach
    public void init(){
        /**
         * Create mocks for fields annotated with the @Mock annotation
         * Create an instance of the field annotated with @InjectMocks and try to inject the mocks into it
         */
        closeable = MockitoAnnotations.openMocks(this);
    }
//    @AfterEach
//    public void close() throws Exception {
//        closeable.close();
//    }

    @Test
    public void InjectMocksThenTest(){
        assertNotNull(dummyService.getRepository());

//        when(dummyService.info()).thenReturn("repo1");
        assertEquals("repo1", dummyService.info());
    }
}
