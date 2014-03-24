package com.rigers.db;

// Generated 24-mar-2014 14.44.56 by Hibernate Tools 3.4.0.CR1

/**
 * VideosorveglianzaId generated by hbm2java
 */
public class VideosorveglianzaId implements java.io.Serializable {

	private int idVideosorveglianza;
	private int idDispositivoPub;
	private int idCompartimento;

	public VideosorveglianzaId() {
	}

	public VideosorveglianzaId(int idVideosorveglianza, int idDispositivoPub,
			int idCompartimento) {
		this.idVideosorveglianza = idVideosorveglianza;
		this.idDispositivoPub = idDispositivoPub;
		this.idCompartimento = idCompartimento;
	}

	public int getIdVideosorveglianza() {
		return this.idVideosorveglianza;
	}

	public void setIdVideosorveglianza(int idVideosorveglianza) {
		this.idVideosorveglianza = idVideosorveglianza;
	}

	public int getIdDispositivoPub() {
		return this.idDispositivoPub;
	}

	public void setIdDispositivoPub(int idDispositivoPub) {
		this.idDispositivoPub = idDispositivoPub;
	}

	public int getIdCompartimento() {
		return this.idCompartimento;
	}

	public void setIdCompartimento(int idCompartimento) {
		this.idCompartimento = idCompartimento;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VideosorveglianzaId))
			return false;
		VideosorveglianzaId castOther = (VideosorveglianzaId) other;

		return (this.getIdVideosorveglianza() == castOther
				.getIdVideosorveglianza())
				&& (this.getIdDispositivoPub() == castOther
						.getIdDispositivoPub())
				&& (this.getIdCompartimento() == castOther.getIdCompartimento());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdVideosorveglianza();
		result = 37 * result + this.getIdDispositivoPub();
		result = 37 * result + this.getIdCompartimento();
		return result;
	}

}