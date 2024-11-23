package com.event.Event.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "Example Controller", description = "APIs for example operations")
public class ExampleController {

    @GetMapping("/example")
    @Operation(summary = "Get example", description = "Returns an example message")
    public String getExample() {
        return "Hello, Swagger!";
    }
}
