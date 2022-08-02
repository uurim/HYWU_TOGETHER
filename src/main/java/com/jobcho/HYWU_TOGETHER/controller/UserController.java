package com.jobcho.HYWU_TOGETHER.controller;
import com.jobcho.HYWU_TOGETHER.model.User;
import com.jobcho.HYWU_TOGETHER.repository.UserRepository;
import com.jobcho.HYWU_TOGETHER.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PersistenceContext
    private EntityManager entityManager;

    // 전체 조회
    @GetMapping("searchAll")
    public List<User> searchAll() {
        return userService.searchAll();
    }

    // age 파라미터를 사용한 조회
    @GetMapping("searchParam")
    public List<User> searchParam(@RequestParam(value = "age") int age) {
        return userService.searchParam(age);
    }

    // Repository에 작성한 쿼리를 이용한 조회
    @GetMapping("searchParamRepo")
    public List<User> searchParamRepo(@RequestParam(value = "name") String name) {
        return userService.searchParamRepo(name);
    }

    // 삽입
    @GetMapping("insert")
    public String insertMember(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age) {
        return userService.insertMember(name, age);
    }

    // 수정
    @GetMapping("update")
    public String updateMember(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age) {
        return userService.updateMember(name, age);
    }

    // 삭제
    @GetMapping("delete")
    public String deleteMember(@RequestParam(value = "name") String name) {
        return userService.deleteMember(name);
    }

}