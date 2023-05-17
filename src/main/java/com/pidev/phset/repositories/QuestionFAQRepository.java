package com.pidev.phset.repositories;

import com.pidev.phset.entities.Inscription;
import com.pidev.phset.entities.Question;
import com.pidev.phset.entities.QuestionFAQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface QuestionFAQRepository extends JpaRepository<QuestionFAQ,Integer> {


}
