package com.jobcho.hywuto.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity : 테이블 정보 설정
@Builder
//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "sample_member")
@Table(name = "sample_member")
public class User {

    @Id
    private String name;

    @Column(nullable = false)
    private int age;

}