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
@Table(name = "tb_bbs_wrt")
public class PostWrite {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int wrtSq;

    @ManyToOne // 한 명이 여러 게시글 작성 관계
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @ManyToOne // 한 게시판에 여러 게시글 작성 관계
    @JoinColumn(name="pst_sq") // foreign key (userId) references User (id)
    private Post post; //참조할 테이블
}
