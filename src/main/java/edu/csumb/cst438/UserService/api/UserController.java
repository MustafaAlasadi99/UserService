package edu.csumb.cst438.UserService.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edu.csumb.cst438.UserService.api.entities.User;
import edu.csumb.cst438.UserService.api.entities.UserCredit;
import edu.csumb.cst438.UserService.api.entities.UserName;

import edu.csumb.cst438.UserService.business.Manager;



@RestController
public class UserController {
    @Autowired
    Manager manager;


    @CrossOrigin(origins = "https://team-7-project.herokuapp.com"  )
    @GetMapping ("/getUserData/{username}")
    @ResponseBody
   public  User RetreiveUserInfo (@PathVariable String username){


        return manager.getUserData(username);
    }
  





}