package com.rigers.db;

// Generated 27-mar-2014 21.08.14 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Compartimento generated by hbm2java
 */
public class Compartimento implements java.io.Serializable {

	private int idCompartimento;
	private String nomeCompartimento;
	private Set dispositivoPubs = new HashSet(0);
	private Set edificios = new HashSet(0);

	public Compartimento() {
	}

	public Compartimento(int idCompartimento) {
		this.idCompartimento = idCompartimento;
	}

	public Compartimento(int idCompartimento, String nomeCompartimento,
			Set dispositivoPubs, Set edificios) {
		this.idCompartimento = idCompartimento;
		this.nomeCompartimento = nomeCompartimento;
		this.dispositivoPubs = dispositivoPubs;
		this.edificios = edificios;
	}

	public int getIdCompartimento() {
		return this.idCompartimento;
	}

	public void setIdCompartimento(int idCompartimento) {
		this.idCompartimento = idCompartimento;
	}

	public String getNomeCompartimento() {
		return this.nomeCompartimento;
	}

	public void setNomeCompartimento(String nomeCompartimento) {
		this.nomeCompartimento = nomeCompartimento;
	}

	public Set getDispositivoPubs() {
		return this.dispositivoPubs;
	}

	public void setDispositivoPubs(Set dispositivoPubs) {
		this.dispositivoPubs = dispositivoPubs;
	}

	public Set getEdificios() {
		return this.edificios;
	}

	public void setEdificios(Set edificios) {
		this.edificios = edificios;
	}

}
