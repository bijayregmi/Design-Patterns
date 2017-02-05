package com.auction.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.auction.domain.Asset;

public interface AssetRepository extends CrudRepository<Asset, Long> {

	 @Query(value = "select e from Asset e where e.User.id= ?1")
	public List<Asset> findAssetsByUserId(Long userId);
	 @Query(value = "select e from Asset e where e.Category.id= ?1")
	public List<Asset> findAssetsByCategoryId(Long categoryId);
}
