package com.event.Event.Service;

import com.event.Event.Model.Event;
import com.event.Event.Model.User;
import com.event.Event.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public EventService eventService;

    public String DoRegisteration(User user)
    {
        userRepository.save(user);
        return "Success";
    }

    public List<Event> CheckLogin(String email,String password)
    {
        boolean loginStatus = userRepository.checkLogin(email,password);
        if(loginStatus)
        {
            List<Event> events = eventService.getAllEvents();
            return events;
        }
        return new ArrayList<>();
    }
}
