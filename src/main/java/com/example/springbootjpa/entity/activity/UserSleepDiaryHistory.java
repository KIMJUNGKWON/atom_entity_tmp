package com.example.springbootjpa.entity.activity;

import com.example.springbootjpa.entity.service.User;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Setter
@Getter
public class UserSleepDiaryHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id", columnDefinition = "char(36) comment '사용자 ID'")
    private User user;

    @Column(name = "user_id", updatable = false, insertable = false)
    @Type(type = "uuid-char")
    private UUID userId;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "contents", nullable = false)
    private String contents;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;



}
