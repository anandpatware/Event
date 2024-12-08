package com.event.Event.Service;

import com.event.Event.Model.Event;
import com.event.Event.Model.LoginResponseDTO;
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

    public LoginResponseDTO CheckLogin(String email,String password)
    {
        User user = userRepository.checkLogin(email,password);
        if(user!=null)
        {

            List<Event> events = eventService.getAllEvents();
            if(user.isAdmin())
            {
                List<User> users = userRepository.getAllNonAdminUser();
                return new LoginResponseDTO(events,users,true);
            }
            else{
                return new LoginResponseDTO(events,new ArrayList<User>(),false);
            }
        }
        return new LoginResponseDTO();
    }
}
