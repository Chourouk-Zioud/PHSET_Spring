package com.pidev.phset.repositories;

import com.pidev.phset.entities.RequestTraining;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository  extends JpaRepository<RequestTraining,Integer> {
}
