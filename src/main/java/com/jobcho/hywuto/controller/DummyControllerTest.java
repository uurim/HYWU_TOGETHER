package com.jobcho.hywuto.controller;

import com.jobcho.hywuto.model.UsrInf;
import com.jobcho.hywuto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/test")
    public String join(UsrInf user) {
        System.out.println("username : " + user.getUsrNm());
        System.out.println("seq number : " + user.getUsrSeqNo());
        System.out.println("email : " + user.getUsrMail());

        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }

}

