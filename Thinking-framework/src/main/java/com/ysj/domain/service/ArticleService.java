package com.ysj.domain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ysj.domain.ResponseResult;
import com.ysj.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult getHotArticle();
}
