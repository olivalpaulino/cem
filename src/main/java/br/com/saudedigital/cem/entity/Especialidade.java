package br.com.saudedigital.cem.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialidades")
public class Especialidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", nullable=false, columnDefinition = "VARCHAR(100)")
	private String nome;
	
	@ManyToMany
	@JoinTable(
			name = "especialidades_medicos",
			joinColumns = @JoinColumn(name = "especialidade_id"),
			inverseJoinColumns = @JoinColumn(name = "medico_id")
	)
	List<Medico> medicos;
	
}
