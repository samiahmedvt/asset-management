package com.example.collibrainterview.service;

import com.example.collibrainterview.model.asset.Asset;
import com.example.collibrainterview.model.asset.AssetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
@AllArgsConstructor
public class AssetService {

    private final AssetRepository assetRepository;

    public Asset createCustomer(Asset asset) {
        return assetRepository.save(asset);
    }

    public Asset findByCustomerId(Long id) throws NotFoundException {
        Optional<Asset> customerOptional = assetRepository.findById(id);
        if (customerOptional.isEmpty()) {
            throw new NotFoundException("Cannot find customer");
        }
        return customerOptional.get();
    }


    public List<Asset> getAllCustomers() {
        return StreamSupport.stream(assetRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Asset updateCustomer(Long id, Asset asset) {

        return assetRepository.save(asset);
    }

    public void deleteCustomerById(Long id) {
        assetRepository.deleteById(id);
    }

    public void deleteCustomers() {
        assetRepository.deleteAll();
    }

}
