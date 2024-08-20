package com.finance.financemanager;

import com.finance.financemanager.Service.LiabilityService;

import com.finance.financemanager.model.Liability;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liability")
public class LiabilityController {
    private final LiabilityService liabilityService;

    public LiabilityController(LiabilityService liabilityService) { this.liabilityService = liabilityService; }

    @GetMapping("/all")
    public ResponseEntity<List<Liability>> getAllLiabilities () {
        List<Liability> liabilities = liabilityService.findAllLiabilities();
        return new ResponseEntity<>(liabilities, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Liability> getLiabilityById(@PathVariable("id") Long id) {
        Liability liability = liabilityService.findLiabilityById(id);
        return new ResponseEntity<>(liability, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Liability> addLiability(@RequestBody Liability liability) {
        Liability newLiability = liabilityService.addLiability((liability));
        return new ResponseEntity<>(newLiability, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Liability> updateLiability(@RequestBody Liability liability) {
        Liability updateLiability = liabilityService.updateLiability(liability);
        return new ResponseEntity<>(updateLiability, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLiability(@PathVariable("id") Long id) {
        liabilityService.deleteLiability(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
