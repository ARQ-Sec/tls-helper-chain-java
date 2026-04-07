package com.arq.tlshelperchainjava.service;

import com.arq.tlshelperchainjava.repository.DisputeRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DisputeServiceTest {
    @Test
    void returnsSeedData() {
        DisputeService service = new DisputeService(new DisputeRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
