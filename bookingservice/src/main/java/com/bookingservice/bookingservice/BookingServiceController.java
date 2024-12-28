package com.bookingservice.bookingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BookingServiceController {

    @GetMapping("/")
    public Map<String, String> getMethodName() {

        Map<String, String> map = new HashMap<>();

        System.out.println("Hiiiiiiiiiiiiii");

        map.put("msg", "Okay");
        return map;
    }

}
