package com.fblib.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 28.08.12
 * Time: 3:47
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "CATEGORY_GENRE")
public class CategoryGenre implements Serializable {
    @Id
    @Column(name = "CATEGORY_GENRE_ID", updatable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "NAME", nullable = false, length = 64)
    private String name;
    @NotNull @Column(name = "FB_NAME", nullable = false, length = 24)
    private String fbName;

    public CategoryGenre(Long id, String name, String fbName) {
        this.id = id;
        this.name = name;
        this.fbName = fbName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFbName() {
        return fbName;
    }

    public void setFbName(String fbName) {
        this.fbName = fbName;
    }

    @Override
    public String toString() {
        return "CategoryGenre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fbName='" + fbName + '\'' +
                '}';
    }
}
