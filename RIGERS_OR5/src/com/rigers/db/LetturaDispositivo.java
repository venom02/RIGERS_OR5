package com.rigers.db;

// Generated 24-mar-2014 14.44.56 by Hibernate Tools 3.4.0.CR1

/**
 * LetturaDispositivo generated by hbm2java
 */
public class LetturaDispositivo implements java.io.Serializable {

	private LetturaDispositivoId id;
	private Dispositivo dispositivo;

	public LetturaDispositivo() {
	}

	public LetturaDispositivo(LetturaDispositivoId id, Dispositivo dispositivo) {
		this.id = id;
		this.dispositivo = dispositivo;
	}

	public LetturaDispositivoId getId() {
		return this.id;
	}

	public void setId(LetturaDispositivoId id) {
		this.id = id;
	}

	public Dispositivo getDispositivo() {
		return this.dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

}