package br.com.fiap.albunsapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.albunsapi.model.Album;

public class AlbumDao {
	
	List<Album> albuns = new ArrayList<>();
	
	public AlbumDao() {
		var album1 = new Album(
				1L,
				"The Dark Side of the Moon",
				"Pink Floyd",
				"Rock",
				42,
				10,
				10.0
				);
		var album2 = new Album(
				2L,
				"Dirt",
				"Alice In Chains",
				"Rock",
				57,
				13,
				8.7
				);
		
		albuns.add(album1);
		albuns.add(album2);
	}
	
	public List<Album> findAll(){
		return albuns;
	}

	public Album findById(Long id) {
		return albuns
				.stream()
				.filter(album -> album.id() == id)
				.findFirst()
				.orElse(null);
	}

	public void delete(Long id) {
		var album = findById(id);
		albuns.remove(album);
	}
}
