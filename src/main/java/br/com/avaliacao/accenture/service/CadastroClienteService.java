package br.com.avaliacao.accenture.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.avaliacao.accenture.dao.ClienteDao;
import br.com.avaliacao.accenture.pojo.Cliente;

@Path("/cadastro/cliente")
public class CadastroClienteService {

	@GET
	@Path("/ping")
	public String ping(){
		return "Pong";
	}
	
	@POST
	@Path("/rest")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrarClienteJson(Cliente cliente){
				
		if(cliente.getCodigo() == null){
			return Response.ok("Código do cliente não pode ser nulo!").build();
		}
		
		if(cliente.getNome() == null){
			return Response.ok("Nome do cliente não pode ser nulo!").build();
		}
		
		if(cliente.getCpf() == null){
			return Response.ok("CPF do cliente não pode ser nulo!").build();
		}
		
		ClienteDao.getInstance().save(cliente);
		
		return Response.ok("Cliente cadastrado com sucesso!").build();
		
	}
	
	
	@POST
	@Path("/soap")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Response cadastrarClienteXml(Cliente cliente){
				
		if(cliente.getCodigo() == null){
			return Response.ok("Código do cliente não pode ser nulo!").build();
		}
		
		if(cliente.getNome() == null){
			return Response.ok("Nome do cliente não pode ser nulo!").build();
		}
		
		if(cliente.getCpf() == null){
			return Response.ok("CPF do cliente não pode ser nulo!").build();
		}
		
		ClienteDao.getInstance().save(cliente);
		
		return Response.ok("Cliente cadastrado com sucesso!").build();
		
	}

	
}
