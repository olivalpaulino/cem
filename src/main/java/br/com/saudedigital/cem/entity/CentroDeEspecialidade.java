package br.com.saudedigital.cem.entity;

import java.util.List;

import javax.annotation.processing.Generated;

import org.hibernate.tuple.GeneratedValueGeneration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "centro_de_especialidades")
public class CentroDeEspecialidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", nullable=false, columnDefinition = "VARCHAR(100)")
	private String nome;
	
	@Column(name = "cnpj", nullable=false, columnDefinition = "VARCHAR(14)")
	private String cnpj;
	
	@Column(name = "estado", nullable=false, columnDefinition = "VARCHAR(19)")
	private String estado;
	
	@Column(name = "cidade", nullable=false, columnDefinition = "VARCHAR(23)")
	private String cidade;
	
	@Column(name = "rua", nullable=false, columnDefinition = "VARCHAR(60)")
	private String rua;
	
	@Column(name = "bairro", nullable=false, columnDefinition = "VARCHAR(50)")
	private String bairro;
	
	@Column(name = "cep", nullable=false, columnDefinition = "VARCHAR(8)")
	private String cep;
	
	
	
	List<Especialidade> especialidades;
	List<Medico> medicos;
}
