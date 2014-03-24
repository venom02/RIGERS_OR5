package com.rigers.db;

// Generated 24-mar-2014 14.44.56 by Hibernate Tools 3.4.0.CR1

/**
 * MeterRipartitoreCaloreId generated by hbm2java
 */
public class MeterRipartitoreCaloreId implements java.io.Serializable {

	private int idDispositivo;
	private int idEdificio;

	public MeterRipartitoreCaloreId() {
	}

	public MeterRipartitoreCaloreId(int idDispositivo, int idEdificio) {
		this.idDispositivo = idDispositivo;
		this.idEdificio = idEdificio;
	}

	public int getIdDispositivo() {
		return this.idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public int getIdEdificio() {
		return this.idEdificio;
	}

	public void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MeterRipartitoreCaloreId))
			return false;
		MeterRipartitoreCaloreId castOther = (MeterRipartitoreCaloreId) other;

		return (this.getIdDispositivo() == castOther.getIdDispositivo())
				&& (this.getIdEdificio() == castOther.getIdEdificio());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdDispositivo();
		result = 37 * result + this.getIdEdificio();
		return result;
	}

}
