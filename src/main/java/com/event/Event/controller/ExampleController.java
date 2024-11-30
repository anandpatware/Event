package com.event.Event.controller;

import com.event.Event.Model.Event;
import com.event.Event.Model.User;
import com.event.Event.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Example Controller", description = "APIs for example operations")
public class ExampleController {

@Autowired
UserService userService;

    @GetMapping("/example")
    @Operation(summary = "Get example", description = "Returns an example message")
    public String getExample() {
        return "Hello, Swagger!";
    }


    @PostMapping("/register")
    public String register(@RequestBody User user)
    {
        return userService.DoRegisteration(user);
    }

    @GetMapping("/login")
    public List<Event> login(@RequestParam String email, @RequestParam String password){return userService.CheckLogin(email,password);}
}
