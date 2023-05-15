package com.pidev.phset.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
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
public class Candidacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCandidacy;
    LocalDateTime dateCandidacy;
    String cvUrl;
    String coverLetterUrl;
    String email;

    @ManyToOne
    Offer offer;

    @ManyToOne
    User users ;
}
