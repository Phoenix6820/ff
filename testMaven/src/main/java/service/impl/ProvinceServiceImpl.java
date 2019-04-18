package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProvinceDao;
import entity.Province;
import service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService {
	@Autowired
	ProvinceDao pDao;

	@Override
	public List<Province> searchAll() {
		return pDao.searchAll();
	}

}
