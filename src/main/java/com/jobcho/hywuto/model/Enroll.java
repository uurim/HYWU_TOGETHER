package com.jobcho.hywuto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_lec_en")
public class Enroll {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int enSq;

    @ManyToOne // 한 명이 여러 강좌 수강
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @ManyToOne // 한 강좌가 여러 수강관계
    @JoinColumn(name="lec_sq") // foreign key (userId) references User (id)
    private Lecture lecture; //참조할 테이블
}
