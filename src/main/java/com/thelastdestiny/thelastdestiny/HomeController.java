package com.thelastdestiny.thelastdestiny;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "The Last Destiny - Of Rising Challenger";
    }

}
