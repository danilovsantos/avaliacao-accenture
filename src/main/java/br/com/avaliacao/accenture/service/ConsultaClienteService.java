package br.com.avaliacao.accenture.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.avaliacao.accenture.dao.ClienteDao;
import br.com.avaliacao.accenture.pojo.Cliente;

@Path("/consulta/cliente")
public class ConsultaClienteService {

	@GET
	@Path("/rest/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultarClienteJson(@PathParam("codigo") Long codigo){
		Cliente cliente = ClienteDao.getInstance().getByCodigo(codigo);
		return Response.ok(cliente).build();
	}
	
	@GET
	@Path("/soap/{codigo}")
	@Produces(MediaType.APPLICATION_XML)
	public Cliente consultarClienteXml(@PathParam("codigo") Long codigo){
		Cliente cliente = ClienteDao.getInstance().getByCodigo(codigo);
		return cliente;
	}
	
	
}
