package com.event.Event.controller;

import com.event.Event.Model.User;
import com.event.Event.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "Example Controller", description = "APIs for example operations")
public class ExampleController {

@Autowired
     RegistrationService registrationService;

    @GetMapping("/example")
    @Operation(summary = "Get example", description = "Returns an example message")
    public String getExample() {
        return "Hello, Swagger!";
    }


    @PostMapping("/register")
    public String register(@RequestBody User user)
    {
        return registrationService.DoRegisteration(user);
    }
}
