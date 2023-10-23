package com.example.product.bo;

import com.example.product.dao.ProductDAO;
import com.example.product.dao.ProductDAOImpl;
import com.example.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
