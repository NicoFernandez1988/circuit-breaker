package com.rate_service.repository;

import com.rate_service.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RateRepository extends JpaRepository<Rate, Integer> {

    Optional<Rate> findByType(String type);
}
