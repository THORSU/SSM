package com.test.pojo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: QuincySu
 * Date: 2018-07-30
 * Time: 10:16
 */
public class User {
    //用户id
    private String id;
    //用户名
    private String name;
    //密码
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
