package com.example.unit.services;

import lombok.extern.slf4j.Slf4j;

public class GSTService {



    private GstProvider gstProvider;

    public GSTService(GstProvider gstProvider) {
        this.gstProvider = gstProvider;
    }

    public GSTService() {
    }

    public int calculateGst()
    {
        System.out.println("calculating gst");
        int rate =  this.gstProvider.getGSTDetails();
        System.out.println("gst rate is"+rate);
        return rate;


    }
}


