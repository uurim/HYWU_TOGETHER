package com.jobcho.HYWU_TOGETHER.user;

import com.jobcho.HYWU_TOGETHER.model.User;
import com.jobcho.HYWU_TOGETHER.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class userRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = new User();
        user.setName("잔디");
        user.setAge(23);
        User newUser = userRepository.save(user);
        System.out.println(newUser);
    }
}
