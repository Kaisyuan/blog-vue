package com.kaisyuan.blog.Admin.controller.user;

import com.kaisyuan.blog.Admin.dto.UserDto;
import com.kaisyuan.blog.Admin.service.user.IUserService;
import com.kaisyuan.blog.controller.BaseController;
import com.kaisyuan.blog.Admin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping(value = "admin/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "getUserById")
    public List<User> getUserById(UserDto userDto){
        List<User> userList = new ArrayList<>();
        //User user = userService.getUserById(id);
        for(int i = 0;i <= 5;i++){
            User user = new User();
            user.setId("abcd" + i);
            user.setUsername("aaa" + i);
            user.setPassword("bbb"  + i);
            userList.add(user);
        }
        return userList;
    }
}
