package dao;

import java.util.List;

import entity.City;

public interface CityDao {
	public List<City> searchByPId(int pId);
}
