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
@Table(name = "tb_usr_mem")
public class Member {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int memSq;

    @ManyToOne // 한 명이 여러 팀 (여러 멤버가 될 수 있음)
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @ManyToOne // 한 팀이 여러 멤버
    @JoinColumn(name="tem_sq") // foreign key (userId) references User (id)
    private Team team; //참조할 테이블

    @Column(name="mem_is_pm")
    private String memIsPm;
}
