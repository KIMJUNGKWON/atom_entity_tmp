package com.example.springbootjpa.entity.activity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class ChildSleepDiaryQuestionOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "contents", nullable = false)
    private String contents;

    @Column(name = "next_question")
    private int nextQuestion;

    @CreationTimestamp
    @Column(name = "reg_dtm", nullable = false)
    private LocalDateTime regDtm;

    @UpdateTimestamp
    @Column(name = "mod_dtm", nullable = false)
    private LocalDateTime modDtm;

}


