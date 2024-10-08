package com.example.registrationandpublicity.entity;

import java.util.Date; // Import for Date
import jakarta.persistence.Entity;
import jakarta.persistence.Table; // Import for Table
import jakarta.persistence.Column; // Import for Column
import jakarta.persistence.Id; // Import for Id
import jakarta.persistence.GeneratedValue; // Import for GeneratedValue
import jakarta.persistence.GenerationType; // Import for GenerationType

@Entity
@Table(name = "mt_employee")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(name = "address")
    private String address;

    public Employe() {
    }

    public Employe(Long id, String name, String gender, Date dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    // Getters and Setters...

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
