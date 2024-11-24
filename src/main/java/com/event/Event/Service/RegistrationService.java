package com.event.Event.Service;

import com.event.Event.Model.User;
import com.event.Event.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    public UserRepository userRepository;
    public String DoRegisteration(User user)
    {
        userRepository.save(user);
        return "Success";
    }
}
