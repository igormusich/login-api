package com.rbc.login.web;

import com.rbc.login.model.CredentialType;
import com.rbc.login.model.LoginCredential;
import com.rbc.login.model.LoginProfile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController()
public class LoginController {
    @RequestMapping("/login")
    public LoginProfile getLoginProfile(@RequestParam(value="loginId") String loginId){
        LoginProfile profile = new LoginProfile();

        profile.id = UUID.randomUUID();
        profile.loginId = loginId;
        profile.credentials.add(new LoginCredential(profile, CredentialType.PASSWORD, true));

        return  profile;
    }
}
