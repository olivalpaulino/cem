package br.com.saudedigital.cem.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
	
	@Column(name = "cep", nullable=false, columnDefinition = "VARCHAR(60)")
	private String cep;
	
	@Column(name = "estado", nullable=false, columnDefinition = "VARCHAR(60)")
	private String estado;
	
	@Column(name = "cidade", nullable=false, columnDefinition = "VARCHAR(60)")
	private String cidade;
	
	@Column(name = "rua", nullable=false, columnDefinition = "VARCHAR(60)")
	private String rua;
	
	@Column(name = "bairro", nullable=false, columnDefinition = "VARCHAR(60)")
	private String bairro;
	
	@Column(name = "numero_da_casa", nullable=false, columnDefinition = "VARCHAR(5)")
	private Integer numeroCasa;
	
	@Column(name = "ponto_de_referencia", nullable=false, columnDefinition = "VARCHAR(60)")
	private String pontoDeReferencia;
	
	@OneToMany(mappedBy = "endereco", cascade = CascadeType.ALL)
	List<Paciente> pacientes = new ArrayList<>();
}
