package com.finance.financemanager;

import com.finance.financemanager.Service.RegistrationService;
import com.finance.financemanager.model.Household;
import com.finance.financemanager.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class RegistrationController {
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) { this.registrationService = registrationService; }

    @GetMapping("/find/{householdUsername}")
    public ResponseEntity<Household> getAccountByHouseholdUsername(@PathVariable("householdUsername") String householdUsername) {
        Household household = registrationService.findHouseholdByHouseholdUsername(householdUsername);
        return new ResponseEntity<>(household, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Household> addHousehold(@RequestBody Household household) {
        Household newHousehold = registrationService.addHousehold((household));
        return new ResponseEntity<>(newHousehold, HttpStatus.CREATED);
    }

}
