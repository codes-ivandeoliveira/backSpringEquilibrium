package com.equilibriumWeb.entidades;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class ProcessoEntidade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer numero;
	private Instant dataEntrada;
	private Double valorPedido;
	private String objetivo; 
	
	public ProcessoEntidade() {
		
	}

	public ProcessoEntidade(Integer id, Integer numero, Instant dataEntrada, Double valorPedido, String objetivo) {
		super();
		this.id = id;
		this.numero = numero;
		this.dataEntrada = dataEntrada;
		this.valorPedido = valorPedido;
		this.objetivo = objetivo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Instant getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Instant dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessoEntidade other = (ProcessoEntidade) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
