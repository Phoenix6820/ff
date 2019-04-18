package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductDao;
import entity.Product;
import service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao proDao;

	@Override
	public List<Product> searchAll() {
		return proDao.searchAll2();
	}

}
