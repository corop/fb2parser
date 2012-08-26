package com.fblib.entity;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 25.08.12
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public class Genre {
    private Long id;
    private Long fbVersion;
    private String name;
    private String fbTag;

    public Genre(long id, String name, String fbTag) {
        this.id = id;
        this.name = name;
        this.fbTag = fbTag;
    }

}
