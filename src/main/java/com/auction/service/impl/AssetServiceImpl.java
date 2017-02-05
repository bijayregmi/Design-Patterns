package com.auction.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auction.dao.AssetRepository;
import com.auction.domain.Asset;
import com.auction.service.AssetService;
@Service
public class AssetServiceImpl implements AssetService {
 @Autowired
 AssetRepository assetRepository;
 
	@Override
	public List<Asset> getAllAssets() {
		// TODO Auto-generated method stub
		return (List<Asset>) assetRepository.findAll();
	}

	@Override
	public Asset save(Asset asset) {
		// TODO Auto-generated method stub
		return assetRepository.save(asset);
	}


	@Override
	public Asset get(long id) {
		// TODO Auto-generated method stub
		return assetRepository.findOne( id);
	}

	@Override
	public List<Asset> getAssetsByUser(long userId) {
		// TODO Auto-generated method stub
		return assetRepository.findAssetsByUserId(userId);
	}

	@Override
	public List<Asset> getAssetsByAssetCategory(long categoryId) {
		// TODO Auto-generated method stub
		return assetRepository.findAssetsByCategoryId(categoryId);
	}

	@Override
	public void deleteAsset(Asset asset) {
		// TODO Auto-generated method stub
		assetRepository.delete(asset);
	}

	

	

}
