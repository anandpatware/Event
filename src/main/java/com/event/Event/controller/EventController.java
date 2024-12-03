
package com.event.Event.controller;

import com.event.Event.Model.Event;
import com.event.Event.Service.EventService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/events")

@Tag(name = "Event Controller", description = "APIs for event operations")
public class EventController {


    @Autowired
    EventService eventService;

    @PostMapping
    public String addEvent(@RequestBody Event event)
    {
        if(eventService.addEvent(event))
        {
            return "Success";
        }
        else {
             return "Failure";
        }

    }
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}

