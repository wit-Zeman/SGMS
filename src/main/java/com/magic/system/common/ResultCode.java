package com.magic.system.common;

public enum ResultCode {

    SUCCESS(200, "成功"),

    FAIL(400, "失败"),

    UNAUTHORIZED(401, "未认证"),

    NOT_FOUND(404, "未找到"),

    INTERNAL_SERVER_ERROR(500, "服务器内部错误");

    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
