package com.jobcho.HYWU_TOGETHER.service;

import com.jobcho.HYWU_TOGETHER.model.User;
import com.jobcho.HYWU_TOGETHER.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    private User user;

    public List<User> searchAll() {
        return userRepository.findAll();
    }

    public List<User> searchParam(int age) {
        return entityManager.createQuery("select m from sample_member m where age > :age", User.class)
                .setParameter("age", age)
                .getResultList();
    }

    public List<User> searchParamRepo(String name) {
        return userRepository.searchParamRepo(name);
    }

    public String insertMember(String name, int age) {
        if(userRepository.findById(name).isPresent()) {
            return "동일한 이름이 이미 있습니다";
        } else {
            userRepository.save(User.builder().name(name).age(age).build());
            return "이름 : " + name + " 나이 : " + age + "으로 추가 되었습니다";
        }
    }

    public String updateMember(String name, int age) {
        if(userRepository.findById(name).isEmpty()) { // 값 존재여부 확인
            return "입력한 " + name + "이 존재하지 않습니다";
        } else {
            userRepository.save(User.builder().name(name).age(age).build());
            return name + "의 나이를 " + age + "로 변경 완료";
        }
    }

    public String deleteMember(String name) {
        if(userRepository.findById(name).isEmpty()) { // 값 존재여부 확인
            return "입력한 " + name + "이 존재하지 않습니다";
        } else {
            userRepository.delete(User.builder().name(name).build());
            return name + " 삭제 완료";
        }
    }

}