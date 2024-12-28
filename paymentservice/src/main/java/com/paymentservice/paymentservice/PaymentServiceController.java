package com.paymentservice.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PaymentServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public Object bookingServiceCaller() {

        // RestTemplate restTemplate = new RestTemplate();
        Object response = restTemplate.getForObject("http://bookingservice/", Object.class);
        return response;
    }
}
