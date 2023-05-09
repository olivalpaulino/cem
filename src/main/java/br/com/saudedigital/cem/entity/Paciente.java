package br.com.saudedigital.cem.entity;

import javax.annotation.processing.Generated;

import org.springframework.aot.generate.GeneratedTypeReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", nullable=false, columnDefinition = "VARCHAR(100)")
	private String nome;
	
	@Column(name = "cpf", nullable=false, columnDefinition = "VARCHAR(11)")
	private String cpf;
	
	@Column(name = "telefone1", nullable=true, columnDefinition = "VARCHAR(11)")
	private String telefone1;
	
	@Column(name = "telefone2", nullable=true, columnDefinition = "VARCHAR(11)")
	private String telefone2;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id")
	Endereco endereco;
}
