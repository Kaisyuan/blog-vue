package com.kaisyuan.blog.Admin.controller.tags;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "admin/tags")
public class TagsController {

    @GetMapping(value = "getTags")
    public List<String> getTags(){
        return null;
    }
}
