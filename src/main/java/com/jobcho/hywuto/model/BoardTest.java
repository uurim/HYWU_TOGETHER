package com.jobcho.hywuto.model;

import jdk.jfr.Timespan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BoardTest {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int id;

    private String pstNm;
    private String pstCon;
    private String usrNm;

    @CreationTimestamp
    private LocalDateTime pstUpDt;

    @UpdateTimestamp
    private LocalDateTime pstModDt;
}
