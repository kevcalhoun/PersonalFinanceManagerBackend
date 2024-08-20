package com.finance.financemanager.Service;

import com.finance.financemanager.exception.AccountNotFoundException;
import com.finance.financemanager.model.Household;
import com.finance.financemanager.repository.HouseholdRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@Transactional
public class RegistrationService {
    private final HouseholdRepository householdRepository;

    @Autowired
    public RegistrationService(HouseholdRepository householdRepository) { this.householdRepository = householdRepository; }

    public Household findHouseholdByHouseholdUsername(String householdUsername) {
        return householdRepository.findHouseholdByHouseholdUsername(householdUsername)
                .orElseThrow(() -> new AccountNotFoundException("Household Account " + householdUsername + " was not found. Register to create your account."));
    }

    public Household addHousehold(Household household) {
        household.setHouseholdCode(UUID.randomUUID().toString());
        return householdRepository.save(household);
    }

    public Household updateHousehold(Household household) { return householdRepository.save(household); }

    public void deleteHousehold(Long id) { householdRepository.deleteHouseholdById(id); }
}











