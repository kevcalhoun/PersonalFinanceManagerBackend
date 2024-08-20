package com.finance.financemanager.Service;

import com.finance.financemanager.exception.AssetNotFoundException;
import com.finance.financemanager.model.Liability;
import com.finance.financemanager.repository.LiabilityRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class LiabilityService {
    private final LiabilityRepository liabilityRepository;

    @Autowired
    public LiabilityService(LiabilityRepository liabilityRepository) {
        this.liabilityRepository = liabilityRepository;
    }

    public Liability addLiability(Liability liability) {
        liability.setLiabilityCode(UUID.randomUUID().toString());
        return liabilityRepository.save(liability);
    }

    public List<Liability> findAllLiabilities() {
        return liabilityRepository.findAll();
    }

    public Liability updateLiability(Liability liability) {
        return liabilityRepository.save(liability);
    }

    public Liability findLiabilityById(Long id) {
        return liabilityRepository.findLiabilityById(id)
                .orElseThrow(() -> new AssetNotFoundException("Liability by id " + id + " was not found"));
    }

    public void deleteLiability(Long id){
        liabilityRepository.deleteLiabilityById(id);
    }
}
