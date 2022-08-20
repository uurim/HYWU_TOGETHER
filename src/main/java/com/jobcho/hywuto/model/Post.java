package com.jobcho.hywuto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_bbs_pst")
public class Post {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int pstSq;

    @ManyToOne // 하나의 게시판은 여러개의 포스트
    @JoinColumn(name="bbs_sq") // foreign key (userId) references User (id)
    private Board board; //참조할 테이블

    @ManyToOne // 한 명이 여러 포스트
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @Column(name="pst_nm")
    private String pstNm;

    @Lob
    @Column(name="pst_con")
    private String pstCon;

    @Column(name="pst_memo")
    private String pstMemo;

    @Column(name="pst_lock")
    private int pstLock;

    @Column(name="pst_mark")
    private int pstMark;

    @Column(name="pst_cnt")
    private int pstCnt;

    @CreationTimestamp
    @Column(name="pst_up_dt")
    private Timestamp bbsNewDt;

    @UpdateTimestamp
    @Column(name="pst_mod_dt")
    private Timestamp bbsModDt;
}
