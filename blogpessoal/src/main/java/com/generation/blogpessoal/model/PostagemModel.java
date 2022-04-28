package com.generation.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //Faz o objeto virar uma table no BD

// Dá um nome para a tabela no meu banco de dados
@Table(name= "tb_postagem") 
public class PostagemModel {

	// Definir a coluna de id como chave primaria
	@Id 
	
	// Equivalente ao auto_increment no mysql
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	// Define que o campo é obrigatorio
	@NotNull
	@Size(min = 5, max = 100, message = "O campo deve ter no minimo 5 caracteres e no maximo 100 caracteres")
	public String titulo;
	
	// Define que o campo é obrigatorio
	@NotNull
	public String texto;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		
	}
	
	
}