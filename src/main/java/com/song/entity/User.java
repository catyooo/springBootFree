package com.song.entity;


import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/11/0011
 * Time: 11:16
 */
@Entity
// @Table标签，指定数据库中对应的表名，id配置为主键，生成策略为自动生成
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
