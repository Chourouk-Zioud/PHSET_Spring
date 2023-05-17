package com.pidev.phset.repositories;

import com.pidev.phset.entities.Inscription;
import com.pidev.phset.entities.TypeGrid;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface IInscriptionRepository extends CrudRepository<Inscription,Integer> {
    Set<Inscription> getAllByOfferIsNull();

    @Query("select count (ins) from Inscription ins where ins.state=false and ins.offer.offerType='Job'")
    int countNewInscriptionsForJob();

    @Query("select ins from Inscription ins where ins.state=false and ins.offer.offerType='Job'")
    Set<Inscription> listNewInscriptionsForJob();

    @Query("select count (ins) from Inscription ins where ins.user.interview=null and ins.offer.offerType='Admission'")
    int countNewInscriptionsForAdmission();

    @Query("select ins from Inscription ins where ins.user.interview=null and ins.offer.offerType='Admission'")
    Set<Inscription> listNewInscriptionsForAdmission();

    @Query("select count (ins) from Inscription ins where ins.user.interview=null and ins.offer.offerType='Spontaneous'")
    int countNewInscriptionsForSpontaneous();

    @Query("select ins from Inscription ins where ins.user.interview=null and ins.offer.offerType='Spontaneous'")
    Set<Inscription> listNewInscriptionsForSpontaneous();

    @Query("select ins from Inscription ins order by ins.dateInscription asc ")
    List<Inscription> getAllInscriptionAsc();

    List<Inscription> getInscriptionByOffer_OfferType(TypeGrid offerType);

    List<Inscription> getInscriptionByDateInscription(Date date);
}
