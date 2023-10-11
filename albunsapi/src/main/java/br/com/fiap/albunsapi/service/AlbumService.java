package br.com.fiap.albunsapi.service;

import java.util.List;

import br.com.fiap.albunsapi.data.AlbumDao;
import br.com.fiap.albunsapi.model.Album;


public class AlbumService {
	AlbumDao dao = new AlbumDao();

	public List<Album> findAll() {
		
		return dao.findAll();
	}
}
