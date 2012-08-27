package com.fblib.entity;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 25.08.12
 * Time: 0:42
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "BOOK")
public class Book implements Serializable {
    @Id
    @Column(name="BOOK_ID", updatable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="BOOK_NAME", nullable = false, length = 64)
    private String name;
    @NaturalId
    @ManyToOne
    private Author author;
    @Column(name="BOOK_DESCR", nullable = false, length = 160)
    private String description;
    @Column(name="BOOK_RATIO")
    private Integer ratio;
    @NaturalId
    @ManyToOne
    private CategoryGenre categoryGenre;
    @NaturalId
    @ManyToOne
    private Genre genre;
    @NaturalId
    @ManyToOne
    private Seria seria;
    @Column(name="BOOK_SERIA_ORDER")
    private int seriaOrder;
    @Column(name="BOOK_COVER")
    private String cover;
    @Column(name="BOOK_THUMB_COVER")
    private String thumbCover;
}
