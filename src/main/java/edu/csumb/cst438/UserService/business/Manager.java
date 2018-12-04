package edu.csumb.cst438.UserService.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.csumb.cst438.UserService.api.entities.User;
import edu.csumb.cst438.UserService.data.UserDbClient;

@Service
public class Manager {
    @Autowired
    UserDbClient heroDbClient;

    
    public User getUserData (String username) {
      
       return  heroDbClient.getUserInfo(username);



    }
}