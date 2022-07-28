package com.jobcho.HYWU_TOGETHER.repository;

import com.jobcho.HYWU_TOGETHER.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
}
