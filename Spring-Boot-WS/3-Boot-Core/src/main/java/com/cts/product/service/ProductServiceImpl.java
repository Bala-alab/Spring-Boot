package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDaoImpl;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductDaoImpl prodDao;

	public void saveProduct() {
		prodDao.saveProduct();

	}

}
