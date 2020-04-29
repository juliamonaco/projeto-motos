package br.com.fiap.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

public class MotosModel {
	
	private long id;
	private String marca;
	private String nome;
	private String modelo;
	private String descricao;
	private double preco;
	private double custoBeneficio;
	private double valorizacao;
	
	public MotosModel() {}
	
	public MotosModel(long id, String marca, String nome, String modelo, String descricao, double preco,
			String caracteristicas, double custoBeneficio, double valorizacao) {
		super();
		this.id = id;
		this.marca = marca;
		this.nome = nome;
		this.modelo = modelo;
		this.descricao = descricao;
		this.preco = preco;
		this.custoBeneficio = custoBeneficio;
		this.valorizacao = valorizacao;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Size(min = 2, max = 40, message = "Nome deve ter no mínimo 2 e no máximo 40 caracteres")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Size(min = 1, max = 200, message = "Descricao deve ter no mínimo 1 e no máximo 200 caracteres")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@DecimalMin(value = "0.1", message = "Preço deve ser acima de 0.0")
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@DecimalMin(value = "0.1", message = "Preço deve ser acima de 0")
	public double getCustoBeneficio() {
		return custoBeneficio;
	}
	public void setCustoBeneficio(double custoBeneficio) {
		this.custoBeneficio = custoBeneficio;
	}

	@DecimalMin(value = "0.1", message = "Preço deve ser acima de 0")
	public double getValorizacao() {
		return valorizacao;
	}
	public void setValorizacao(double valoriazacao) {
		this.valorizacao = valoriazacao;
	}
	
}
