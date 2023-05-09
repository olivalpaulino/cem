package br.com.saudedigital.cem.entity;

import java.util.Date;

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
@Table(name = "recepcionistas")
public class Recepcionista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", nullable = false, columnDefinition = "VARCHAR(100)" )
	private String nome;
	
	@Column(name = "data_de_nascimento", nullable = false, columnDefinition = "DATE")
	private Date dataNascimento;
	
	@Column(name = "cpf", nullable = false, columnDefinition = "VARCHAR(11)")
	private String cpf;
	
	@Column(name = "telefone1", nullable = false, columnDefinition = "VARCHAR(11)")
	private String telefone1;
	
	@Column(name = "telefone2", nullable = false, columnDefinition = "VARCHAR(11)")
	private String telefone2;
	
	@Column(name = "login", nullable = false, columnDefinition = "VARCHAR(20)")
	private String login;
	
	@Column(name = "senha", nullable = false, columnDefinition = "VARCHAR(16)")
	private String senha;
	
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "endereo_id")
	private Endereco endereco;
}
