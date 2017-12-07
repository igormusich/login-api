package com.rbc.login.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
public class LoginProfile {

    public LoginProfile(){
        credentials = new ArrayList<>();
    }
    @Id
    @Column(columnDefinition="BINARY(16) NOT NULL", name = "ID")
    @JsonProperty(value="id", access=JsonProperty.Access.READ_ONLY)
    public UUID id;

    public String loginId;

    @OneToMany
    public List<LoginCredential> credentials;
}
