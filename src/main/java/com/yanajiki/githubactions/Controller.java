package com.yanajiki.githubactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm healthy";
    }
}
