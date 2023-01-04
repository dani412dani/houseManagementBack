package com.example.manageAppback.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    @JsonProperty
    private String firstName;

    @Column(name = "last_name")
    @JsonProperty
    private String lastName;

    @Column(name = "email")
    @JsonProperty
    private String email;


    @Column(name = "password")
    @JsonProperty
    private String password;

    public String getPassword() {
        return this.password;
    }
}
