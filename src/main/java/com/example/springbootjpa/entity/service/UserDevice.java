package com.example.springbootjpa.entity.service;

import com.example.springbootjpa.entity.type.Os;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class UserDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id", columnDefinition = "char(36) comment '사용자 ID'")
    private User user;

    @Column(name = "user_id", updatable = false, insertable = false)
    @Type(type = "uuid-char")
    private UUID userId;

    @Column(name = "os_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private Os os;

    @Column(name = "os_version")
    private String osVersion;

    @Column(name = "push_token", nullable = false)
    private String pushToken;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;

}
