package com.rigers.db;

// Generated 27-mar-2014 21.08.14 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * DispositivoPub generated by hbm2java
 */
public class DispositivoPub implements java.io.Serializable {

	private DispositivoPubId id;
	private Compartimento compartimento;
	private String nomeDispositivoPub;
	private Set letturaDispositivoPubs = new HashSet(0);

	public DispositivoPub() {
	}

	public DispositivoPub(DispositivoPubId id, Compartimento compartimento) {
		this.id = id;
		this.compartimento = compartimento;
	}

	public DispositivoPub(DispositivoPubId id, Compartimento compartimento,
			String nomeDispositivoPub, Set letturaDispositivoPubs) {
		this.id = id;
		this.compartimento = compartimento;
		this.nomeDispositivoPub = nomeDispositivoPub;
		this.letturaDispositivoPubs = letturaDispositivoPubs;
	}

	public DispositivoPubId getId() {
		return this.id;
	}

	public void setId(DispositivoPubId id) {
		this.id = id;
	}

	public Compartimento getCompartimento() {
		return this.compartimento;
	}

	public void setCompartimento(Compartimento compartimento) {
		this.compartimento = compartimento;
	}

	public String getNomeDispositivoPub() {
		return this.nomeDispositivoPub;
	}

	public void setNomeDispositivoPub(String nomeDispositivoPub) {
		this.nomeDispositivoPub = nomeDispositivoPub;
	}

	public Set getLetturaDispositivoPubs() {
		return this.letturaDispositivoPubs;
	}

	public void setLetturaDispositivoPubs(Set letturaDispositivoPubs) {
		this.letturaDispositivoPubs = letturaDispositivoPubs;
	}

}
