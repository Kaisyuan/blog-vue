package com.kaisyuan.blog.controller.article;


import com.kaisyuan.blog.controller.BaseController;
import com.kaisyuan.blog.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "article")
public class ArticleController extends BaseController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "addArticle")
    public void addArticle(){
        HttpServletRequest request = this.getRequest();
        String id = request.getParameter("id");
        System.out.println(id);
    }
}
