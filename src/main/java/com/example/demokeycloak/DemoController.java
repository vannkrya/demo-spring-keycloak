package com.example.demokeycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("")
    @PreAuthorize("hasRole('client_user')")
    public String hello() {
        return "hello from spring boot & keycloak!";
    }

    @GetMapping("/hello2")
    @PreAuthorize("hasRole('client_admin')")
    public String hello2() {
        return "hello from spring boot & keycloak - ADMIN";
    }
}
