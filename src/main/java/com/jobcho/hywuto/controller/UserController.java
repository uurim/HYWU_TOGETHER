package com.jobcho.hywuto.controller;
import com.jobcho.hywuto.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "register";
    }
}