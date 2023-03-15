package com.example.collibrainterview.rest;

import com.example.collibrainterview.model.asset.Asset;
import com.example.collibrainterview.service.AssetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.List;

@RestController
@AllArgsConstructor
public class AssetController {

    private final AssetService customerService;

    @PostMapping("/customer")
    public Asset createCustomer(@RequestBody Asset asset) {
        return customerService.createCustomer(asset);
    }

    @GetMapping("/customer/{id}")
    public Asset getCustomer(@PathVariable(value = "id") Long id) throws NotFoundException {
        return customerService.findByCustomerId(id);
    }

    @GetMapping("/customers")
    public List<Asset> getCustomers() throws NotFoundException {
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable(value = "id") Long id) {
        customerService.deleteCustomerById(id);
    }

    @DeleteMapping("/customers")
    public void deleteCustomers() {
        customerService.deleteCustomers();
    }
}
