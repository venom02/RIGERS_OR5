package com.rigers.db;

// Generated 24-mar-2014 14.44.56 by Hibernate Tools 3.4.0.CR1

/**
 * MeterRipartitoreCalore generated by hbm2java
 */
public class MeterRipartitoreCalore implements java.io.Serializable {

	private MeterRipartitoreCaloreId id;
	private Dispositivo dispositivo;
	private Integer unitaConsumo;

	public MeterRipartitoreCalore() {
	}

	public MeterRipartitoreCalore(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public MeterRipartitoreCalore(Dispositivo dispositivo, Integer unitaConsumo) {
		this.dispositivo = dispositivo;
		this.unitaConsumo = unitaConsumo;
	}

	public MeterRipartitoreCaloreId getId() {
		return this.id;
	}

	public void setId(MeterRipartitoreCaloreId id) {
		this.id = id;
	}

	public Dispositivo getDispositivo() {
		return this.dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Integer getUnitaConsumo() {
		return this.unitaConsumo;
	}

	public void setUnitaConsumo(Integer unitaConsumo) {
		this.unitaConsumo = unitaConsumo;
	}

}
