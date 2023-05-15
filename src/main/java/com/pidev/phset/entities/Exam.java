package com.pidev.phset.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Exam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idExam;
    String titleExam;
    String descriptionExam;
    LocalDateTime deadlineExam;
    String subjectExam;
    String levelExam;
    String stateExam;
    Float scoreExam;

    @OneToOne(mappedBy = "exam")
    @JsonIgnore
    Course course;

    @OneToMany(mappedBy = "exam")
    Set<QuestionExam> questionExams;
}
