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
@Table(name = "tb_pot")
public class Portfolio {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int potSq;

    @OneToOne //한 학생이 한 개의 포트폴리오
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @Lob
    @Column(name="pot_url")
    private String potUrl;
}
