package com.lambdacode.springboot.controller;

import com.lambdacode.springboot.entity.User;
import com.lambdacode.springboot.service.UserService;
import com.lambdacode.springboot.service.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
   private UserService userService;

    @PostMapping("/add")
    public String adduser(@RequestBody User user){
        userService.adduser(user);
// here we are adding so no need to write return type String but now we return Succesfull so .
        return "Successfull";
    }
    @PutMapping("/update/{id}")
    public void Updateuser(@PathVariable Integer id, @RequestBody User user){
        userService.updateuser(id,user);
    }

    @GetMapping("/get")
    public List<User>getall(){
        return userService.getUser();
    }

    @DeleteMapping("/delete/{id}")
    public void Deletuser(@PathVariable Integer id){
        userService.deletuser(id);
    }
}
