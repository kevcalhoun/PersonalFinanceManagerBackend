package com.finance.financemanager.repository;
import com.finance.financemanager.model.Household;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HouseholdRepository extends JpaRepository<Household, Long> {
    void deleteHouseholdById(Long id);

    Optional<Household> findHouseholdByHouseholdUsername(String householdUsername);

}
