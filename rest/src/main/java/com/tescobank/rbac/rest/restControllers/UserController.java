package com.tescobank.rbac.rest.restControllers;

import com.tescobank.rbac.rest.entity.User;
import com.tescobank.rbac.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/user/{id}"}, method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable int id){
        return userService.findById(id);
    }


}
