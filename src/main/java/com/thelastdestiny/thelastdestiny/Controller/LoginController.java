package com.thelastdestiny.thelastdestiny.Controller;


import com.thelastdestiny.thelastdestiny.Service.ServiceLogin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    private final ServiceLogin serviceLogin;

    public LoginController(ServiceLogin serviceLogin) {
        this.serviceLogin = serviceLogin;
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> body) {
        boolean ok = serviceLogin.loginUser(body.get("user"), body.get("password"));
        return Map.of(
                "success", ok,
                "remainingAttempts", serviceLogin.getMaxAttempts()
        );
    }

}
