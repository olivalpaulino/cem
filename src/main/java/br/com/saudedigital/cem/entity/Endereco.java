package br.com.saudedigital.cem.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cep;
	private String estado;
	private String cidade;
	private String rua;
	private String bairro;
	private Integer numeroCasa;
	private String pontoDeReferencia;
	
	@OneToMany(mappedBy = "endereco", cascade = CascadeType.ALL)
	List<Paciente> pacientes = new ArrayList<>();
}
