package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CityDao;
import entity.City;
import service.CityService;

@Service
public class CityServiceImpl implements CityService {
	@Autowired
	CityDao cDao;

	@Override
	public List<City> searchByPId(int pId) {
		return cDao.searchByPId(pId);
	}

}
