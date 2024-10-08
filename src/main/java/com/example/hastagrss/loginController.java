package com.example.hastagrss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class loginController {
    @Autowired
    public loginRepository loginRepository;

    @PostMapping("/loginHastane")
    public String loginUser(@RequestBody loginEntity loginEntity) {
        String loginStatus = "Login Failed";
        try {
            loginEntity user = loginRepository.findByUsernameAndPassword(loginEntity.getUsername(), loginEntity.getPassword());
            if (user != null) {
                loginStatus = "Login Success";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loginStatus;
    }
}
