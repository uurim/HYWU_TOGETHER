package com.jobcho.hywuto.repository;

import com.jobcho.hywuto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository : 쿼리 정보 설정
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
//    Optional<UsrInf> findByUsrNm(String usrNm);
}
