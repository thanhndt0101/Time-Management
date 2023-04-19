package com.bul.FMSTimeManager.controllers;

import com.bul.FMSTimeManager.daos.RequestRepository;
import com.bul.FMSTimeManager.daos.SettingRepository;
import com.bul.FMSTimeManager.models.AuthRequest;
import com.bul.FMSTimeManager.models.Request;
import com.bul.FMSTimeManager.models.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


    @GetMapping("/")
    public String welcome() {
        return "Welcome to javatechie !!";
    }


}
