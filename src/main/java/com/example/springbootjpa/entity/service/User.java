package com.example.springbootjpa.entity.service;

import com.example.springbootjpa.entity.type.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class User {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "char(36) comment 'uuid'")
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nick_name", nullable = false)
    private String nickName;

    @Column(name = "login_id", nullable = false)
    private String loginId;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    @Column(name = "point", nullable = false)
    private int point;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "phone_number", nullable = false)
    private int phoneNumber;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "is_parents_mode")
    private boolean isParentsMode;

    @Column(name = "inquire_notification")
    private boolean inquireNotification;

    @Column(name = "education_notification")
    private boolean educationNotification;

    @Column(name = "environment_notification")
    private boolean environmentNotification;

    @Column(name = "research_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private Research research;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;

}