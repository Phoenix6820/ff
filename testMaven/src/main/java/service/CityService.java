package service;

import java.util.List;

import entity.City;

public interface CityService {
	public List<City> searchByPId(int pId);
}
