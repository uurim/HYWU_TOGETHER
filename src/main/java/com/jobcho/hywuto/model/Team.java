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
@Table(name = "tb_usr_tem")
public class Team {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int temSq;

    @ManyToOne // 하나의 강의는 여러개의 팀
    @JoinColumn(name="lec_sq") // foreign key (userId) references User (id)
    private Lecture lecture; //참조할 테이블

    @Column(name="tem_nm")
    private String temNm;

}
