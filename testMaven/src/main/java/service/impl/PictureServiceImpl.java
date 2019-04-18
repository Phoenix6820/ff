package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.PictureDao;
import entity.Picture;
import service.PictureService;

public class PictureServiceImpl implements PictureService {
	@Autowired
	PictureDao picDao;

	@Override
	public List<Picture> searchByProduct(int id) {
		return picDao.searchByProduct(id);
	}

}
