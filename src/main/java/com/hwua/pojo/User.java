package com.hwua.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String username;  //用户名
    private String password;  //密码
    private String email;  //邮箱
    private Integer phoneNum;  //手机号
}
