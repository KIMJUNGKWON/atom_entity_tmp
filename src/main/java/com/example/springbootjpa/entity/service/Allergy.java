package com.example.springbootjpa.entity.service;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Allergy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = AllergyCategory.class)
    @JoinColumn(name = "allergy_category_id", referencedColumnName = "id")
    private AllergyCategory allergyCategory;

    @Column(name = "allergy_category_id", updatable = false, insertable = false)
    private long allergyCategoryId;

    @Column(name = "name", nullable = false)
    private String name;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;

}
