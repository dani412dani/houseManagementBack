package com.example.manageAppback.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "apertments")
public class Apertment {
    @Id
    @Column(name = "apertment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Integer apertmentId;

    @Column(name = "adress")
    @JsonProperty
    private String adress;

    @Column(name = "is_building")
    @JsonProperty
    private Boolean isBuilding;

    @JsonProperty
    @JoinColumn(name = "user_id")
    @ManyToOne(targetEntity = User.class)
    private User userId;
}
