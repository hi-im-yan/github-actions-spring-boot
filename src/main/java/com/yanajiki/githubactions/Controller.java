package com.yanajiki.githubactions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${what_env_is_this}")
    private String whatEnvIsThis;

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm healthy. I'm on the environment: " + whatEnvIsThis;
    }

    @GetMapping("/new-feature")
    public String newFeature() {
        return "I'm a new feature. I'm on the environment: " + whatEnvIsThis;
    }
}
