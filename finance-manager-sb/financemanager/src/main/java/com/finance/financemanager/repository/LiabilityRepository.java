package com.finance.financemanager.repository;

import com.finance.financemanager.model.Liability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LiabilityRepository extends JpaRepository<Liability, Long> {
    void deleteLiabilityById(Long id);

    Optional<Liability> findLiabilityById(Long id);
}
