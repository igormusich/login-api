package com.rbc.login.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class LoginCredential {

    public LoginCredential(){

    }

    public LoginCredential(LoginProfile profile, CredentialType credentialType, Boolean required){
        this.profile = profile;
        this.credentialType = credentialType;
        this.required = required;
    }
    @Id
    @GeneratedValue
    @JsonIgnore
    public Long id;

    @JsonIgnore
    @ManyToOne
    public LoginProfile profile;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    public CredentialType credentialType;

    public Boolean required;
}
