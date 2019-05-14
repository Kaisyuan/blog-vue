package com.kaisyuan.blog.Admin.controller;

import com.kaisyuan.blog.Admin.service.IUserService;
import com.kaisyuan.blog.controller.BaseController;
import com.kaisyuan.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "getUserById")
    public User getUserById(){
        String id = this.getRequest().getParameter("id");
        User user = userService.getUserById(id);
        return user;
    }
}
