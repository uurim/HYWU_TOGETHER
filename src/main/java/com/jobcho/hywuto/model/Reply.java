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
@Table(name = "tb_bbs_re")
public class Reply {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int reSq;

    @ManyToOne // 하나의 포스트에 여러 개의 댓글
    @JoinColumn(name="pst_sq") // foreign key (userId) references User (id)
    private Post post; //참조할 테이블

    @ManyToOne // 한 명이 여러 댓글
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @Column(name="re_par_sq")
    private int reParSq;

    @Lob
    @Column(name="re_con")
    private String reCon;

    @Column(name="re_lv")
    private int reLv;

    @CreationTimestamp
    @Column(name="re_up_dt")
    private Timestamp reUpDt;

    @UpdateTimestamp
    @Column(name="re_mod_dt")
    private Timestamp reModDt;

}
