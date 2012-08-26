package com.fblib.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 26.08.12
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
public class FbVersion implements Serializable {
    private Long id;
    private Integer major;
    private Integer minor;

    public FbVersion(Long id, Integer major, Integer minor) {
        this.id = id;
        this.major = major;
        this.minor = minor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getMinor() {
        return minor;
    }

    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    @Override
    public String toString() {
        return "FbVersion{" +
                "id=" + id +
                ", major=" + major +
                ", minor=" + minor +
                '}';
    }
}
