package com.jobcho.hywuto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_met")
public class Meeting {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int metSq;

    @ManyToOne // 한 명의 교수가 한 개 이상의 면담 개설
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @ManyToOne // 하나의 강좌에 한 개 이상의 면담 개설
    @JoinColumn(name="lec_sq") // foreign key (userId) references User (id)
    private Lecture lecture; //참조할 테이블

    @Column(name="met_nm")
    private String metNm;

    @Column(name="met_dd")
    private Date metDd;

    @Column(name="met_tm_s")
    private Time metTmS;

    @Column(name="met_tm_e")
    private Time metTmE;

    @Column(name="met_loc")
    private String metLoc;

    @Column(name="met_tp")
    private int metTp;

    @Column(name="met_tm_tp")
    private int metTmTp;

    @Column(name="met_st")
    private int metSt;
}
