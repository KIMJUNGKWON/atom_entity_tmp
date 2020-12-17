package com.example.springbootjpa.entity.service;

import com.example.springbootjpa.entity.type.Os;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class AppVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "os_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private Os os;

    @Column(name = "version", nullable = false)
    private String version;

    @Column(name = "is_force", nullable = false)
    private boolean isForce;

    @Column(name = "description")
    private String description;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;
}
