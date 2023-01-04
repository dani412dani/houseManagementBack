package com.example.manageAppback.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "faults")
public class Fault {
    @Id
    @Column(name = "fault_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Integer faultId;

    @Column(name = "tytle")
    @JsonProperty
    private String tytle;

    @Column(name = "content")
    @JsonProperty
    private String content;

    @Column(name = "is_fixed")
    @JsonProperty
    private Boolean isFixed;

    @JsonProperty
    @JoinColumn(name = "apertment_id")
    @ManyToOne(targetEntity = Apertment.class)
    private Apertment apertmentId;

    public void changeFixed(Boolean changer) {
        isFixed = changer;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
