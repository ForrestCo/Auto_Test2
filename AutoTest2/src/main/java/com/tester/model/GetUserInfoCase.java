package com.tester.model;

import lombok.Data;

@Data  //引入lombok依赖，在编译期间@Data会自动加上get，set方法
public class GetUserInfoCase {
    private int userId;
    private String expected;
}
