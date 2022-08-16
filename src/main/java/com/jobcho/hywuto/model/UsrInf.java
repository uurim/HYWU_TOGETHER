package com.jobcho.hywuto.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

//Entity : 테이블 정보 설정
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_usr_inf")
public class UsrInf {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int usrSq;

//    @Column(nullable = false, length = 1)
//    private int usrTp;

    @Column(nullable = false, unique = true)
    private int usrSeqNo;

    @Column(nullable = false, length = 30, unique = true)
    private String usrNm;

    @Column(nullable = false, length = 30, unique = true)
    private String usrId;

    @Column(nullable = false, length = 60, unique = true)
    private String usrMail;

    @CreationTimestamp // 시간 자동 입력
    private Timestamp usrReqDt;

    private Timestamp usrModDt;

}