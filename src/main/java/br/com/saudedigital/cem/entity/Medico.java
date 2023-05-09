package br.com.saudedigital.cem.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", nullable=false, columnDefinition = "VARCHAR(100)")
	private String nome;
	
	@Column(name = "crm", nullable=false, columnDefinition = "VARCHAR(9)")
	private String crm;
	
	@Column(name = "cpf", nullable=false, columnDefinition = "VARCHAR(8)")
	private String cpf;
	
	@Column(name = "data_nascimento", nullable=false, columnDefinition = "VARCHAR(8)")
	private Date dataNascimento;
	
	@ManyToMany
	private Especialidade especialidade;
	
}
