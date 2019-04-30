package com.company.project.core;

import com.github.pagehelper.PageInfo;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static <T> Result<T> genSuccessTable(PageInfo pageInfo) {
        return new Result()
                .setCode(ResultCode.TABLE_SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setTotal(pageInfo.getTotal())
                .setData(pageInfo.getList());
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }
}
