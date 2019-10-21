package top.godoom.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private String userGuid;

    private String email;

    private String phone;

    private String name;

    private String passwd;

    private String confirmPasswd;

    private Integer type;

    private Date createTime;

    private Date updateTime;
}
