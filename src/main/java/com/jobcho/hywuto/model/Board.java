package com.jobcho.hywuto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_bbs_inf")
public class Board {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int bbsSq;

    @ManyToOne // 한 명이 여러 게시판
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @ManyToOne // 한 팀이 여러 게시판
    @JoinColumn(name="tem_sq") // foreign key (userId) references User (id)
    private Team team; //참조할 테이블

    @Column(name="bbs_nm")
    private String bbsNm;

    @Column(name="bbs_fav")
    private int bbsFav;

    @CreationTimestamp
    @Column(name="bbs_new_dt")
    private Timestamp bbsNewDt;

    @UpdateTimestamp
    @Column(name="bbs_mod_dt")
    private Timestamp bbsModDt;
}
