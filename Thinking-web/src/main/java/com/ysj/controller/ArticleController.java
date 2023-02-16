package com.ysj.controller;

import com.ysj.domain.ResponseResult;
import com.ysj.domain.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("getHotArticle")
    public ResponseResult getHotArticle(){
        ResponseResult result = articleService.getHotArticle();
        return result;
    }
}
