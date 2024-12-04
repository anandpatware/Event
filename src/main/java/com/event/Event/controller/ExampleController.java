package com.event.Event.controller;

import com.event.Event.Model.Event;
import com.event.Event.Model.User;
import com.event.Event.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${admin.secret.key}") // Secret key from application properties
    private String adminSecretKey;

    @GetMapping("/example")
    @Operation(summary = "Get example", description = "Returns an example message")
    public String getExample() {
        return "Hello, Swagger!";
    }


    @PostMapping("/register")
    public String register(@RequestBody User user, @RequestParam(required = false) String secretKey) {
        // Check if it's an admin registration
        if (secretKey != null && secretKey.equals(adminSecretKey)) {
            user.isAdmin = true;
        } else {
            user.isAdmin = false;
        }

        userService.DoRegisteration(user);

        return user.isAdmin ? "Admin registered successfully!" : "User registered successfully!";
    }

    @GetMapping("/login")
    public List<Event> login(@RequestParam String email, @RequestParam String password){
        //if login is for admin then send list of all user expect admin and list of all events.
        return userService.CheckLogin(email,password);
    }
}
