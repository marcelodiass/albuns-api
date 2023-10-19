package br.com.fiap.albunsapi;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import br.com.fiap.albunsapi.model.Album;
import br.com.fiap.albunsapi.service.AlbumService;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("album")
public class AlbumResource {
	
	AlbumService service = new AlbumService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Album> index(){
		
		return service.findAll();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") Long id) {
		var album = service.findById(id);
		if (album == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		
		return Response.ok(album).build();
	}
	
	@DELETE
	@Path("{id}")
	public Response destroy(@PathParam("id") Long id) {
		var album = service.findById(id);
		
		if (album == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		
		service.delete(id);
		return Response.noContent().build();
	}
}
