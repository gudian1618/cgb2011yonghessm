package com.github.gudian1618.cgb2011yonghessm.pojo;

import java.io.Serializable;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/17 9:16 下午
 */

public class Door implements Serializable {

    private static final long serialVersionUID = 1537098008421204299L;
    private Integer id;
    private String name;
    private String tel;
    private String addr;

    public Door() {
    }

    public Door(Integer id, String name, String tel, String addr) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Door{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", tel='" + tel + '\'' +
            ", addr='" + addr + '\'' +
            '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
