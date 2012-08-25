package com.fblib.entity;


import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 25.08.12
 * Time: 0:42
 * To change this template use File | Settings | File Templates.
 */
public class Book implements Serializable {
    private String id;
    private String name;
    private String author;
    private String description;
    private int ratio;
    private Genre genre;
    private Seria seria;
    private String coverId;
    private String thumbCoverId;
}
