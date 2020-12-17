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
public class UserExposeExperimentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id", columnDefinition = "char(36) comment '사용자 ID'")
    private User user;

    @Column(name = "user_id", updatable = false, insertable = false)
    @Type(type = "uuid-char")
    private UUID userId;

    @OneToOne(targetEntity = ExposeExperimentOption.class)
    @JoinColumn(name = "expose_experiment_option_id", referencedColumnName = "id")
    private ExposeExperimentOption exposeExperimentOption;

    @Column(name = "expose_experiment_option_id", updatable = false, insertable = false)
    private long exposeExperimentOptionId;

    @Column(name = "user_option")
    private String userOption;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;

}
