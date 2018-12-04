package edu.csumb.cst438.UserService.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.csumb.cst438.UserService.api.entities.User;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
@Repository
public class UserDbClient {

    public User getUserInfo (String username) {
       
        String uri = "https://users-db1.herokuapp.com/username/" + username;
       RestTemplate restTemplate = new RestTemplate();
         ResponseEntity<User> result = restTemplate.exchange(uri,
       HttpMethod.GET,null, 
       new ParameterizedTypeReference<User>(){});
        return result.getBody();
    }
}