package com.jd.xya.springbootmybatis.entity;

public class User<Integer> extends Entity<Integer> {
    private String username;
    private String password;

    public User(){}

    public User(Integer id, String useername, String password) {
        super.id = id;
        this.username = useername;
        this.password = password;
    }

    public String getUseername() {
        return username;
    }

    public void setUseername(String useername) {
        this.username = useername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
