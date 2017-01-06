package br.com.avaliacao.accenture.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente{
	
	private Long codigo;
	private String nome;
	private Long cpf;
	
	public Cliente(){}
	
	public Cliente(Long codigo){
		this.codigo = codigo;
	}
	
	public Cliente(Long codigo, String nome, Long cpf){
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	
	@XmlElement
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	
	@XmlElement
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	
	@XmlElement
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}
