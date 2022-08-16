package com.jobcho.hywuto.repository;

import com.jobcho.hywuto.model.UsrInf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Repository : 쿼리 정보 설정
@Repository
public interface UserRepository extends JpaRepository<UsrInf, Integer>{
//    Optional<UsrInf> findByUsrNm(String usrNm);
}
