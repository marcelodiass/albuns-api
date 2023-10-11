package br.com.fiap.albunsapi;

import jakarta.ws.rs.core.MediaType;

import java.util.List;

import br.com.fiap.albunsapi.model.Album;
import br.com.fiap.albunsapi.service.AlbumService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("album")
public class AlbumResource {
	
	AlbumService service = new AlbumService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Album> index(){
		
		return service.findAll();
	}
}
