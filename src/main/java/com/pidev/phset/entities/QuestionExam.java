package com.pidev.phset.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QuestionExam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idQuestExam;
    @Column(length = 2000)
    String textQuestExam;
    @Enumerated(EnumType.STRING)
    Technology technology;

    @ManyToOne
    @JsonIgnore
    Exam exam;

    @OneToMany(mappedBy = "questionExam")
    Set<ReponseExam> reponsesExam;
}