package com.ysj.domain.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Article)表实体类
 *
 * @author ysj
 * @since 2023-02-16 22:02:48
 */
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("ysj_Article")
public class Article {
    //主键
    @TableId
    private Long id;
    //标题
    private String title;
    //文章内容
    private String content;
    //文章类型：1 文章 2 草稿
    private String type;
    //文章摘要
    private String summary;
    //所属分类id
    private Long categoryId;
    //缩略图
    private String thumbnail;
    //是否置顶：0 否 1 是
    private String isTop;
    //状态： 0 已发布 1 草稿
    private String status;
    //评论数
    private Integer commentCount;
    //点赞量
    private Long likeCount;
    //访问量
    private Long viewCount;
    //是否允许评论： 1 是 0 否
    private String isComment;
    //创建者
    private Long createBy;
    //创建时间
    private Date createTime;
    //更新者
    private Long updateBy;
    //更新时间
    private Date updateTime;
    //删除标志： 0代表未删除 1代表已删除
    private Integer delFlag;

}

