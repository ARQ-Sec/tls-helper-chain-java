package com.arq.tlshelperchainjava.service;

import com.arq.tlshelperchainjava.dto.SettlementResponse;
import com.arq.tlshelperchainjava.repository.SettlementRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SettlementService {
    private final SettlementRepository repository;

    public SettlementService(SettlementRepository repository) {
        this.repository = repository;
    }

    public List<SettlementResponse> summarize() {
        return repository.findAll().stream().map(record -> new SettlementResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
