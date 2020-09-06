package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zyl
 * @Date: 2020/9/6 17:55
 * @Describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;


    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
