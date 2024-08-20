package com.finance.financemanager.repository;

import com.finance.financemanager.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BillRepository extends JpaRepository<Bill, Long> {
    void deleteBillById(Long id);

    Optional<Bill> findBillById(Long id);

    List<Bill> findBillsByUserId(Long userId);
}
