package br.com.avaliacao.accenture.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.avaliacao.accenture.pojo.Cliente;

public class ClienteDao {

	private static ClienteDao instance;
	
	public static ClienteDao getInstance() {

        if (instance == null) {
            instance = new ClienteDao();
        }

        return instance;
    }
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public Cliente getByCodigo(Long codigo){
		
		for(Cliente cliente : this.clientes){
			if(cliente.equals(new Cliente(codigo))){
				return cliente;
			}
		}
		
		return null;
	}
	
	public void save(Cliente cliente){
		this.clientes.add(cliente);
	}
	
	
}
