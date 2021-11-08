package com.kaisyuan.blog.Admin.controller.article;


import com.kaisyuan.blog.controller.BaseController;
import com.kaisyuan.blog.Admin.service.article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author
 */
@RestController
@RequestMapping(value = "admin/article")
public class ArticleController extends BaseController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "addArticle")
    public void addArticle(){
        HttpServletRequest request = this.getRequest();
        Map map = request.getParameterMap();
        System.out.println(map);
        articleService.addArticle(map);
    }

    public void findArticleById(){

    }
}
