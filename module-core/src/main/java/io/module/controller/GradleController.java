package io.module.controller;

import io.module.GradleMember;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleController {

    @GetMapping("/")
    public String hello() {
        GradleMember gradle = new GradleMember("Gradle");
        return "hi, i'm " + gradle.getName();
    }

}
