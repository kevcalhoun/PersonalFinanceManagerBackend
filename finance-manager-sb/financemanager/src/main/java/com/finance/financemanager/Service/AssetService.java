package com.finance.financemanager.Service;

import com.finance.financemanager.exception.AssetNotFoundException;
import com.finance.financemanager.model.Asset;
import com.finance.financemanager.repository.AssetRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class AssetService {
    private final AssetRepository assetRepository;
    @Autowired
    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public Asset addAsset(Asset asset) {
        asset.setAssetCode(UUID.randomUUID().toString());
        return assetRepository.save(asset);
    }

    public List<Asset> findAllAssets() {
        return assetRepository.findAll();
    }

    public Asset updateAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public Asset findAssetById(Long id) {
        return assetRepository.findAssetById(id)
                .orElseThrow(() -> new AssetNotFoundException("Asset by id " + id + " was not found"));
    }

    public Asset findAssetsByUserId(Long userId) {
        return assetRepository.findAssetsByUserId(userId)
                .orElseThrow(() -> new AssetNotFoundException("No assets for user id " + userId + " were found"));
    }

    public void deleteAsset(Long id){
        assetRepository.deleteAssetById(id);
    }
}
