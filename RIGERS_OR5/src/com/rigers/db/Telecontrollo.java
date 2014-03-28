package com.rigers.db;

// Generated 27-mar-2014 21.08.14 by Hibernate Tools 3.4.0.CR1

/**
 * Telecontrollo generated by hbm2java
 */
public class Telecontrollo implements java.io.Serializable {

	private TelecontrolloId id;
	private LetturaDispositivoPub letturaDispositivoPub;
	private Integer programmOrarioFunzionamento;
	private Byte comandoInterruttoreMagnetotermico;
	private Byte comandoAperturaDifferenziale;
	private Byte comandoOnOffManuale;
	private Byte dimmerizzazioneOnOff;
	private Integer setPointDimmer;

	public Telecontrollo() {
	}

	public Telecontrollo(LetturaDispositivoPub letturaDispositivoPub) {
		this.letturaDispositivoPub = letturaDispositivoPub;
	}

	public Telecontrollo(LetturaDispositivoPub letturaDispositivoPub,
			Integer programmOrarioFunzionamento,
			Byte comandoInterruttoreMagnetotermico,
			Byte comandoAperturaDifferenziale, Byte comandoOnOffManuale,
			Byte dimmerizzazioneOnOff, Integer setPointDimmer) {
		this.letturaDispositivoPub = letturaDispositivoPub;
		this.programmOrarioFunzionamento = programmOrarioFunzionamento;
		this.comandoInterruttoreMagnetotermico = comandoInterruttoreMagnetotermico;
		this.comandoAperturaDifferenziale = comandoAperturaDifferenziale;
		this.comandoOnOffManuale = comandoOnOffManuale;
		this.dimmerizzazioneOnOff = dimmerizzazioneOnOff;
		this.setPointDimmer = setPointDimmer;
	}

	public TelecontrolloId getId() {
		return this.id;
	}

	public void setId(TelecontrolloId id) {
		this.id = id;
	}

	public LetturaDispositivoPub getLetturaDispositivoPub() {
		return this.letturaDispositivoPub;
	}

	public void setLetturaDispositivoPub(
			LetturaDispositivoPub letturaDispositivoPub) {
		this.letturaDispositivoPub = letturaDispositivoPub;
	}

	public Integer getProgrammOrarioFunzionamento() {
		return this.programmOrarioFunzionamento;
	}

	public void setProgrammOrarioFunzionamento(
			Integer programmOrarioFunzionamento) {
		this.programmOrarioFunzionamento = programmOrarioFunzionamento;
	}

	public Byte getComandoInterruttoreMagnetotermico() {
		return this.comandoInterruttoreMagnetotermico;
	}

	public void setComandoInterruttoreMagnetotermico(
			Byte comandoInterruttoreMagnetotermico) {
		this.comandoInterruttoreMagnetotermico = comandoInterruttoreMagnetotermico;
	}

	public Byte getComandoAperturaDifferenziale() {
		return this.comandoAperturaDifferenziale;
	}

	public void setComandoAperturaDifferenziale(
			Byte comandoAperturaDifferenziale) {
		this.comandoAperturaDifferenziale = comandoAperturaDifferenziale;
	}

	public Byte getComandoOnOffManuale() {
		return this.comandoOnOffManuale;
	}

	public void setComandoOnOffManuale(Byte comandoOnOffManuale) {
		this.comandoOnOffManuale = comandoOnOffManuale;
	}

	public Byte getDimmerizzazioneOnOff() {
		return this.dimmerizzazioneOnOff;
	}

	public void setDimmerizzazioneOnOff(Byte dimmerizzazioneOnOff) {
		this.dimmerizzazioneOnOff = dimmerizzazioneOnOff;
	}

	public Integer getSetPointDimmer() {
		return this.setPointDimmer;
	}

	public void setSetPointDimmer(Integer setPointDimmer) {
		this.setPointDimmer = setPointDimmer;
	}

}
