package com.generation.Farmacia.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome Obrigatório!")
	@Size(min = 5, max = 50, message = "O atributo texto deve conter no mínimo 05 e no máximo 50 caracteres")
	private String nomePD;

	@NotBlank(message = "O atributo Marca Obrigatório!")
	@Size(min = 5, max = 50, message = "O atributo texto deve conter no mínimo 05 e no máximo 50 caracteres")
	private String marca; 
	
	@NotBlank(message = "O atributo Bula é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo Bula deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String bula;
	
	
	private BigDecimal preco ;
	
	@NotBlank(message = "O atributo validade é obrigatorio" )
	private String  Validade;
	
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePD() {
		return nomePD;
	}

	public void setNomePD(String nomePD) {
		this.nomePD = nomePD;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getValidade() {
		return Validade;
	}

	public void setValidade(String validade) {
		Validade = validade;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	


	
	
}
