package com.pidev.phset.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Certificate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCertif;
    String titleCertif;
    String firstName;
    String lastName;
    @JsonIgnore
    LocalDateTime date = LocalDateTime.now();
    String bodyCertif;
    String signatureCertif;
    String UniqueId;
    byte[] qrCode;
    byte[] pdfBytes;
    String certifUrl;
    @JsonIgnore
    @ManyToOne
    Account account;

}
