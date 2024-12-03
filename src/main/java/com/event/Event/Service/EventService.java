package com.event.Event.Service;

import com.event.Event.Model.Event;
import com.event.Event.Repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    public List<Event> getAllEvents() {
        // Sample data for demonstration purposes

        return eventRepository.findAll();

    }

    private static final Logger logger = LoggerFactory.getLogger(EventService.class);

    public boolean addEvent(Event event) {
        try {
            eventRepository.save(event);
            return true;
        } catch (Exception e) {
            logger.error("---------------------------------------------#################------------------------------------------------", e);
            return false;
        }
    }

}

