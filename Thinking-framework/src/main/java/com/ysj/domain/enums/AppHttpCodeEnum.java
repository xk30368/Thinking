package com.ysj.domain.enums;

public enum AppHttpCodeEnum {
    // 成功
    SUCCESS(200, "操作成功"),
    //登录
    NEED_LOGIN(401, "请登录后再操作"),
    //权限
    NO_OPERATOR_AUTH(403, "无权限操作"),
    //错误
    SYSTEM_ERROR(500, "系统错误"),
    //已存在
    USERNAME_EXIST(501, "用户名已存在"),
    //手机号
    PHONE_NUMBER_EXIST(502, "手机号已存在"),
    //邮箱
    EMAIL_EXIST(503, "邮箱已存在"),
    //用户名
    USER_REQUIRE(504, "请填写用户名"),
    //登录错误
    LOGIN_ERROR(505, "用户名或密码错误");

    int code;
    String msg;

    AppHttpCodeEnum(int code, String errorMessage) {
        this.code = code;
        this.msg = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
