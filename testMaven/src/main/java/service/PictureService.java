package service;

import java.util.List;

import entity.Picture;

public interface PictureService {
	public List<Picture> searchByProduct(int id);
}
