package com.auction.service;

import java.util.List;

import com.auction.dao.GenericDao;
import com.auction.domain.Admin;

public interface AdminService{
	public void save(Admin admin);
	public void update(Admin address);
	public List<Admin> findAll(); 
	public Admin findOne(Long id);

}
