package mc.apps.junit5;

import mc.apps.main.Database;

import mc.apps.main.Repository;
import mc.apps.main.Service;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // create mocks based on @Mock annotation (requires JUnit 5)
public class MockitoTests {

//    @Mock // Tells Mockito to mock the databaseMock instance
//    Database database;
//
//    @Test
//    public void DatabaseTest()  {
//        assertNotNull(database);
////        when(databaseMock.isAvailable()).thenReturn(true); // the Mock to return true when its isAvailable method is called
//        when(database.getName()).thenReturn("Demo DB");
//
//        Repository  repository  = new Repository(database);
//        assertEquals("Repository with Database (Injected) : Demo DB", repository.info());
//    }
//
//    @Test
//    public void DatabaseTest2(@Mock Database databaseMock)  {
//        doReturn(true).when(databaseMock).isAvailable();
//        assertTrue(databaseMock.isAvailable());
//    }

    @Mock
    Iterator<String> iterator;
    @Test
    public void DoNextOnIteratorThenTest(){
        when(iterator.next()).thenReturn("JUnit 5").thenReturn("Mockito");
        var result = iterator.next()+" + "+iterator.next();

        assertEquals("JUnit 5 + Mockito", result);
    }


    @Test
    public void ThrowExceptionMockTest() throws IOException {
        //create mock
        OutputStream outputStreamMock = mock(OutputStream.class);
        doThrow(IOException.class).when(outputStreamMock).close();

        //..use mock
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamMock);
        assertThrows(IOException.class, ()->outputStreamWriter.close());
    }



    /**
     * spy..
     */
    @Spy
    Database spy = new Database();  // create spy on real object
    @Test
    public void SpyTest(){
//        doReturn("Demo DB!").when(spy).getName();
        assertEquals("Demo DB!", spy.getName());
    }

}
