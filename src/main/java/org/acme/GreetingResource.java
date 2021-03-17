package org.acme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingResource {
    @GetMapping(produces ="text/plain" )
    public String hello() {
        return "Hello pisipisi";
    }
}