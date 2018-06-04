package com.example.awssprdemog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author mchidambaranathan 6/3/2018
 */
@Entity
public class Person {
    public Person() {
    }

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public Person(final String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
