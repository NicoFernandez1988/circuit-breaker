package com.rate_service.service;

import com.rate_service.model.Rate;
import com.rate_service.repository.RateRepository;
import org.springframework.stereotype.Service;

@Service
public class RateService {

    private final RateRepository rateRepository;

    public RateService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    public Rate getRateByType(String type){
        return rateRepository.findByType(type).orElseThrow(() -> new RuntimeException("Rate Not Found: " + type));
    }

}
