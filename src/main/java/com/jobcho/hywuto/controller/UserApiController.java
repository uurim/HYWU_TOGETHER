package com.jobcho.hywuto.controller;

import com.jobcho.hywuto.dto.ResponseDto;
import com.jobcho.hywuto.model.UsrInf;
import com.jobcho.hywuto.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // 웹과 앱을 겸용할 수 있음.
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/joinProc")
    public ResponseDto<Integer> save(@RequestBody UsrInf user) {
        System.out.println("UserApiController : save 호출됨");
        // 실제 DB에 Insert
        int result = userService.register(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), result);
    }
}
