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
@Table(name = "tb_met_apo")
public class MeetApo {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int apoSq;

    @ManyToOne // 한 면담이 한 개 이상의 예약 관계
    @JoinColumn(name="met_sq") // foreign key (userId) references User (id)
    private Meeting meeting; //참조할 테이블

    @OneToOne // 한 시간대(특정 날짜 특정 시간의 예약)가 하나의 예약 관계
    @JoinColumn(name="stl_sq") // foreign key (userId) references User (id)
    private MeetSlot slot; //참조할 테이블

    @ManyToOne // 한 명의 학생이 한 개 이상의 예약 관계
    @JoinColumn(name="usr_sq") // foreign key (userId) references User (id)
    private User user; //참조할 테이블

    @ManyToOne // 하나의 팀이 한 개 이상의 예약 관계
    @JoinColumn(name="tem_sq") // foreign key (userId) references User (id)
    private Team team; //참조할 테이블

}
