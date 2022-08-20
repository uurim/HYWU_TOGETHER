package com.jobcho.hywuto.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

//Entity : 테이블 정보 설정
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_usr_inf")
public class User {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int usrSq;

    @Column(name="usr_tp")
    private int usrTp;

    @Column(name="usr_seq_no")
    private int usrSeqNo;

    @Column(name="usr_nm")
    private String usrNm;

    @Column(name="usr_id")
    private String usrId;

    @Column(name="usr_mail")
    private String usrMail;

    @CreationTimestamp // 시간 자동 입력
    @Column(name="usr_reg_dt")
    private LocalDateTime usrRegDt = LocalDateTime.now();

    @UpdateTimestamp
    @Column(name="usr_mod_dt")
    private LocalDateTime usrModDt;

}