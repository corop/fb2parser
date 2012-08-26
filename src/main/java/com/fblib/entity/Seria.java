package com.fblib.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 25.08.12
 * Time: 17:45
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "SERIA")
public class Seria implements Serializable {
    @Id
    @Column(name = "SERIA_ID", updatable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "SERIA_NAME", nullable = false, length = 64)
    private String name;
}
