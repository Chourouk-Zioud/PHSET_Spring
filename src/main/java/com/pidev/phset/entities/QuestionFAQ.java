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
public class QuestionFAQ implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idFAQ;
    String textQuestion;
    Integer view;

    @ManyToOne
    @JsonIgnore
    Topic topic;

    @ManyToMany
    Set<Tag> tags;

    @OneToOne(mappedBy = "questionFAQ")
    ReponseFAQ reponseFAQ;

    @ManyToOne
    @JsonIgnore
    Account account;

}
