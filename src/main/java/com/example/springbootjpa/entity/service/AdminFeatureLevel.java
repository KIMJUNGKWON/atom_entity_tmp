package com.example.springbootjpa.entity.service;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class AdminFeatureLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = AdminFeature.class)
    @JoinColumn(name = "admin_feature_id", referencedColumnName = "id", columnDefinition = "char(36) comment '사용자 ID'")
    private AdminFeature adminFeature;

    @Column(name = "admin_feature_id", updatable = false, insertable = false)
    private long adminFeatureId;

    @Column(name = "level", nullable = false)
    private int level;

    @Column(name = "is_enabled", nullable = false)
    private boolean isEnabled;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;


}