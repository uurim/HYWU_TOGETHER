package com.jobcho.hywuto.service;

import com.jobcho.hywuto.model.UsrInf;
import com.jobcho.hywuto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public int register(UsrInf user) {
        try {
            userRepository.save(user);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UserService : register()"+e.getMessage());
        }
        return -1;
    }

}