package com.jobcho.hywuto.user;

import com.jobcho.hywuto.HywuTogetherApplication;
import com.jobcho.hywuto.model.User;
import com.jobcho.hywuto.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={HywuTogetherApplication.class})
@SpringBootApplication
//@ComponentScan("com.jobcho.HYWU_TOGETHER")
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
