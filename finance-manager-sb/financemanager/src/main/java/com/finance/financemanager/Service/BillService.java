package com.finance.financemanager.Service;

import com.finance.financemanager.exception.AssetNotFoundException;
import com.finance.financemanager.exception.BillingNotFoundException;
import com.finance.financemanager.model.Bill;
import com.finance.financemanager.repository.BillRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class BillService {
    private final BillRepository billRepository;
    @Autowired
    public BillService(BillRepository billRepository) { this.billRepository = billRepository; }

    public Bill addBill(Bill bill) {
        bill.setBillCode(UUID.randomUUID().toString());
        return  billRepository.save(bill);
    }

    public List<Bill> findAllBills() { return billRepository.findAll(); }

    public Bill updateBill(Bill bill) { return billRepository.save(bill); }

    public Bill findBillById(Long id) {
        return billRepository.findBillById(id)
                .orElseThrow(() -> new AssetNotFoundException("Bill by id " + id + " was not found"));
    }

    public List<Bill> findBillsByUserId(Long userId) {
        return billRepository.findBillsByUserId(userId);
//                .orElseThrow(() -> new BillingNotFoundException("No bills for user id " + userId + " were found"));
    }

    public void deleteBill(Long id){
        billRepository.deleteBillById(id);
    }
}
