package com.hserang.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Haroun Serang
 */
@Data
@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firstname;
    private String lastname;
    private String description;

    private Employee() {}

    public Employee(String firstname, String lastname, String description) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.description = description;
    }
}
