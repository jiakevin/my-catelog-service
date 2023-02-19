package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test controller
 *
 * @author jiakevin
 * @since 2023-01-18 19:25
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public String getGreeting() {
        return "Welcome to the book catalog!";
    }
}
