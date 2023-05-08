package br.com.saudedigital.cem.entity;

import java.util.List;

public class CentroDeEspecialidade {
	
	private Integer id;
	private String nome;
	private String cnpj;
	private String rua;
	private String bairro;
	private String cep;
	private String estado;
	
	List<Especialidade> especialidades;
	List<Medico> medicos;
}
