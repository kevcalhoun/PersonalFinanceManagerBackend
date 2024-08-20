package com.finance.financemanager.repository;

import com.finance.financemanager.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssetRepository extends JpaRepository<Asset, Long> {
    void deleteAssetById(Long id);

    Optional<Asset> findAssetById(Long id);

    Optional<Asset> findAssetsByUserId(Long userId);
}
