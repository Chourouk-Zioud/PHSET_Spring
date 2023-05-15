package com.pidev.phset.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCours;
    String nameCours;
    @Column(length = 1000)
    String descriptionCours;
    Integer creditCours;
    String professorCours;
    String unit;
    @JsonIgnore
    @Enumerated(EnumType.STRING)
    Technology technology;
    byte[] picture;
    byte[] pdf;
    byte[] video;

    @ManyToOne
    @JsonIgnore
    Training training;

    @OneToOne
    Exam exam;

    @OneToMany(mappedBy = "course")
    Set<Chapter> chapters;
}
