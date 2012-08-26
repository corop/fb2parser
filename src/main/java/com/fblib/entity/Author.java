package com.fblib.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 26.08.12
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */
public class Author implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String homePage;

    public Author(Long id, String firstName, String lastName, String homePage) {
        this.id = id;
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.homePage = homePage.trim();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homePage='" + homePage + '\'' +
                '}';
    }
}
