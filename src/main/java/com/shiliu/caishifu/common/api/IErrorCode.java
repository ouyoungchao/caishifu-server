package com.shiliu.caishifu.common.api;

/**
 * 封装API的错误码
 * Created by ouyangchao on 2019/4/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
