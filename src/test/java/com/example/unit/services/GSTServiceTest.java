package com.example.unit.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)  // use to initialise the object of gst provider of gst service
public class GSTServiceTest {
    @InjectMocks   //to inject object of gstprovider into gstservice
    private GSTService gstService;
    @Mock   // to create the object of gstprovider
    private GstProvider provider;
    @Test
    public void gstCalculateTest()
    {
       // GstProvider provider = new GstProviderImpl();
//        GstProvider  mockProvider     = Mockito.mock(GstProvider.class);
         Mockito.when(provider.getGSTDetails()).thenReturn(18);
//       GSTService gstService = new GSTService(mockProvider);
          int actualResult = gstService.calculateGst();
        Assertions.assertEquals(18,actualResult,"test case failed");


    }
}
   // we are going to use mockito

//class GstProviderImpl implements GstProvider
//{
//
//    @Override
//    public int getGSTDetails() {
//        return 18;
//    }
//}
