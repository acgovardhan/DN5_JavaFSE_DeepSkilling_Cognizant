package com.govardhan;

import org.junit.jupiter.api.Test;

import com.MyService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    
    @Test
    public void testExternalApi()
    {
        //creating mock
        ExternalApi mockApi = mock(ExternalApi.class);

        //stub
        when(mockApi.getData()).thenReturn("mock data");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        assertEquals("mock data", result);
    }

    @Test
    public void verifyExternalApi(){
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi).getData();
    }
}
