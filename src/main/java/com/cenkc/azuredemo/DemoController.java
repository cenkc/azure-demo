package com.cenkc.azuredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Cenk Canarslan on 2021-12-26
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public String demoEndPoint() {
        return "Greetings from Spring Boot, second deployment";
    }
}
