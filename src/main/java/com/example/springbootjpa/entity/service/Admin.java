package com.example.springbootjpa.entity.service;

import com.example.springbootjpa.entity.type.Hospital;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "level", nullable = false)
    private int level;

    @Column(name = "login_id", nullable = false)
    private String loginId;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "login_fail_count", nullable = false)
    private int loginFailCount;

    @Column(name = "is_locked", nullable = false)
    private boolean isLocked;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone_number", nullable = false)
    private int phoneNumber;

    @Column(name = "hospital", nullable = false)
    @Enumerated(EnumType.STRING)
    private Hospital hospital;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;
}
