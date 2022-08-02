package com.jobcho.HYWU_TOGETHER.repository;

import com.jobcho.HYWU_TOGETHER.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repository : 쿼리 정보 설정
@Repository
public interface UserRepository extends JpaRepository<User, String>{
    @Query(value = "select name, age from sample_member where name = :name", nativeQuery=true)
    List<User> searchParamRepo(@Param("name") String name);

}
