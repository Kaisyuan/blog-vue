package com.kaisyuan.blog.Admin.service.article.Impl;

import com.kaisyuan.blog.Admin.dao.article.ArticleMapper;
import com.kaisyuan.blog.Admin.service.article.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public Integer addArticle(Map map) {
        return articleMapper.addArticle();
    }
}
