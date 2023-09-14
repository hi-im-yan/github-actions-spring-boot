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

    @GetMapping("/feature1")
    public String feature1() {
        return "I'm a new feature. I'm on the environment: " + whatEnvIsThis;
    }

    @GetMapping("/feature2")
    public String feature2() {
        return "I'm a feature2. I'm on the environment: " + whatEnvIsThis;
    }

    @GetMapping("/feature3")
    public String feature3() {
        return "I'm a feature3. I'm on the environment: " + whatEnvIsThis;
    }
}
