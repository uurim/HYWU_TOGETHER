package com.jobcho.HYWU_TOGETHER.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usr_info")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usr_sq;

    @Column(length = 30, nullable = false)
    private String usr_name;

    @Column(length = 30, nullable = false)
    private String usr_mail;

    @CreationTimestamp
    private Date usr_createAt;

    public Member(String name, String mail) {
        this.usr_name = name;
        this.usr_mail = mail;
    }
}
