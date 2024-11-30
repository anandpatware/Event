
package com.event.Event.controller;

import com.event.Event.Model.Event;
import com.event.Event.Service.EventService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController

@RequestMapping("/api/events")

@Tag(name = "Event Controller", description = "APIs for event operations")
public class EventController {


    @Autowired
    EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}

