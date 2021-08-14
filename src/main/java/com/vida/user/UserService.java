package com.vida.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUser(Long id, String password) {


        return null;

    }


    public void createUser(User user) {
        userRepo.save(user);
    }

}
