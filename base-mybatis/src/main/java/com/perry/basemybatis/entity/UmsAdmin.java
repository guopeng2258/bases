package com.perry.basemybatis.entity;

import lombok.Data;
import java.util.Date;

@Data
public class UmsAdmin {
    private Long id;
    private String username;
    private String password;
    private String icon;
    private String email;
    private String nickName;
    private String note;
    private Date createTime;
    private Date loginTime;
    private Integer status;
} 