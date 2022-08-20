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
@Table(name = "tb_bbs_tag")
public class Tag {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int tagSq;

    @ManyToOne // 한 포스트에 여러 개의 태그
    @JoinColumn(name="pst_sq") // foreign key (userId) references User (id)
    private Post post; //참조할 테이블

    @Column(name="tag_nm")
    private String tagNm;
}
