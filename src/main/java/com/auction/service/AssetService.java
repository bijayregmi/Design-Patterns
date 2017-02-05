package com.auction.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.auction.domain.*;



public interface AssetService {

	    List<Asset> getAllAssets();
	    Asset save(Asset asset) ;
	    Asset get(long id);
	    List<Asset> getAssetsByUser(long id);
	    List<Asset> getAssetsByAssetCategory(long id);
	//    List<Asset> searchAssets(String searchAssets);
	    void deleteAsset(Asset asset);
	    
}
