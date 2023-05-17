package com.pidev.phset.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestTraining implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idRequest;
    @Enumerated(EnumType.STRING)
    LVL lvl;
    @Column(length = 3000)
    String message;
    @Enumerated(EnumType.STRING)
    Technology technology;

    @ManyToOne
    Account account;
}
