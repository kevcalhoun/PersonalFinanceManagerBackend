package com.finance.financemanager;

import com.finance.financemanager.Service.AssetService;
import com.finance.financemanager.model.Asset;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asset")
public class AssetController {
    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Asset>> getAllAssets () {
        List<Asset> assets = assetService.findAllAssets();
        return new ResponseEntity<>(assets, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Asset> getAssetById(@PathVariable("id") Long id) {
        Asset asset = assetService.findAssetById(id);
        return new ResponseEntity<>(asset, HttpStatus.OK);
    }

    @GetMapping("/find/{userId}")
    public ResponseEntity<Asset> getAssetsByUserId(@PathVariable("userId") Long userId) {
        Asset asset = assetService.findAssetsByUserId(userId);
        return new ResponseEntity<>(asset, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Asset> addAsset(@RequestBody Asset asset) {
        Asset newAsset = assetService.addAsset((asset));
        return new ResponseEntity<>(newAsset, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Asset> updateAsset(@RequestBody Asset asset) {
        Asset updateAsset = assetService.updateAsset(asset);
        return new ResponseEntity<>(updateAsset, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAsset(@PathVariable("id") Long id) {
        assetService.deleteAsset(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
