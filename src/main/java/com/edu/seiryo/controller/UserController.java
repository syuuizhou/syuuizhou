package com.edu.seiryo.controller;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @RequestMapping("/allUser")
    public String list(Model model){
        List<User> list = userService.queryByAllUser();
        System.out.println(list);
        model.addAttribute("list",list);
        return "allUser";
    }
}
