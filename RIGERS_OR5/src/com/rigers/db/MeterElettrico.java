package com.rigers.db;

// Generated 24-mar-2014 14.44.56 by Hibernate Tools 3.4.0.CR1

/**
 * MeterElettrico generated by hbm2java
 */
public class MeterElettrico implements java.io.Serializable {

	private MeterElettricoId id;
	private Dispositivo dispositivo;
	private Integer totEAttivaF1;
	private Integer totEAttivaF2;
	private Integer totEAttivaF3;
	private Integer totEReattiva;
	private Integer energiaAttivaGiornaliera;
	private Integer energiaReattivaGiornaliera;
	private Integer correnteFase1;
	private Integer tensioneFase1;
	private Integer cosphiFase1;
	private Integer correnteFase2;
	private Integer tensioneFase2;
	private Integer cosphiFase2;
	private Integer correnteFase3;
	private Integer tensioneFase3;
	private Integer cosphiFase3;
	private Integer thdFattDistorsione;
	private Integer potAttivaFase1;
	private Integer potReattivaFase1;
	private Integer potApparenteFase1;
	private Integer potAttivaFase2;
	private Integer potReattivaFase2;
	private Integer potApparenteFase2;
	private Integer potAttivaFase3;
	private Integer potReattivaFase3;
	private Integer potApparenteFase3;

	public MeterElettrico() {
	}

	public MeterElettrico(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public MeterElettrico(Dispositivo dispositivo, Integer totEAttivaF1,
			Integer totEAttivaF2, Integer totEAttivaF3, Integer totEReattiva,
			Integer energiaAttivaGiornaliera,
			Integer energiaReattivaGiornaliera, Integer correnteFase1,
			Integer tensioneFase1, Integer cosphiFase1, Integer correnteFase2,
			Integer tensioneFase2, Integer cosphiFase2, Integer correnteFase3,
			Integer tensioneFase3, Integer cosphiFase3,
			Integer thdFattDistorsione, Integer potAttivaFase1,
			Integer potReattivaFase1, Integer potApparenteFase1,
			Integer potAttivaFase2, Integer potReattivaFase2,
			Integer potApparenteFase2, Integer potAttivaFase3,
			Integer potReattivaFase3, Integer potApparenteFase3) {
		this.dispositivo = dispositivo;
		this.totEAttivaF1 = totEAttivaF1;
		this.totEAttivaF2 = totEAttivaF2;
		this.totEAttivaF3 = totEAttivaF3;
		this.totEReattiva = totEReattiva;
		this.energiaAttivaGiornaliera = energiaAttivaGiornaliera;
		this.energiaReattivaGiornaliera = energiaReattivaGiornaliera;
		this.correnteFase1 = correnteFase1;
		this.tensioneFase1 = tensioneFase1;
		this.cosphiFase1 = cosphiFase1;
		this.correnteFase2 = correnteFase2;
		this.tensioneFase2 = tensioneFase2;
		this.cosphiFase2 = cosphiFase2;
		this.correnteFase3 = correnteFase3;
		this.tensioneFase3 = tensioneFase3;
		this.cosphiFase3 = cosphiFase3;
		this.thdFattDistorsione = thdFattDistorsione;
		this.potAttivaFase1 = potAttivaFase1;
		this.potReattivaFase1 = potReattivaFase1;
		this.potApparenteFase1 = potApparenteFase1;
		this.potAttivaFase2 = potAttivaFase2;
		this.potReattivaFase2 = potReattivaFase2;
		this.potApparenteFase2 = potApparenteFase2;
		this.potAttivaFase3 = potAttivaFase3;
		this.potReattivaFase3 = potReattivaFase3;
		this.potApparenteFase3 = potApparenteFase3;
	}

	public MeterElettricoId getId() {
		return this.id;
	}

	public void setId(MeterElettricoId id) {
		this.id = id;
	}

	public Dispositivo getDispositivo() {
		return this.dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Integer getTotEAttivaF1() {
		return this.totEAttivaF1;
	}

	public void setTotEAttivaF1(Integer totEAttivaF1) {
		this.totEAttivaF1 = totEAttivaF1;
	}

	public Integer getTotEAttivaF2() {
		return this.totEAttivaF2;
	}

	public void setTotEAttivaF2(Integer totEAttivaF2) {
		this.totEAttivaF2 = totEAttivaF2;
	}

	public Integer getTotEAttivaF3() {
		return this.totEAttivaF3;
	}

	public void setTotEAttivaF3(Integer totEAttivaF3) {
		this.totEAttivaF3 = totEAttivaF3;
	}

	public Integer getTotEReattiva() {
		return this.totEReattiva;
	}

	public void setTotEReattiva(Integer totEReattiva) {
		this.totEReattiva = totEReattiva;
	}

	public Integer getEnergiaAttivaGiornaliera() {
		return this.energiaAttivaGiornaliera;
	}

	public void setEnergiaAttivaGiornaliera(Integer energiaAttivaGiornaliera) {
		this.energiaAttivaGiornaliera = energiaAttivaGiornaliera;
	}

	public Integer getEnergiaReattivaGiornaliera() {
		return this.energiaReattivaGiornaliera;
	}

	public void setEnergiaReattivaGiornaliera(Integer energiaReattivaGiornaliera) {
		this.energiaReattivaGiornaliera = energiaReattivaGiornaliera;
	}

	public Integer getCorrenteFase1() {
		return this.correnteFase1;
	}

	public void setCorrenteFase1(Integer correnteFase1) {
		this.correnteFase1 = correnteFase1;
	}

	public Integer getTensioneFase1() {
		return this.tensioneFase1;
	}

	public void setTensioneFase1(Integer tensioneFase1) {
		this.tensioneFase1 = tensioneFase1;
	}

	public Integer getCosphiFase1() {
		return this.cosphiFase1;
	}

	public void setCosphiFase1(Integer cosphiFase1) {
		this.cosphiFase1 = cosphiFase1;
	}

	public Integer getCorrenteFase2() {
		return this.correnteFase2;
	}

	public void setCorrenteFase2(Integer correnteFase2) {
		this.correnteFase2 = correnteFase2;
	}

	public Integer getTensioneFase2() {
		return this.tensioneFase2;
	}

	public void setTensioneFase2(Integer tensioneFase2) {
		this.tensioneFase2 = tensioneFase2;
	}

	public Integer getCosphiFase2() {
		return this.cosphiFase2;
	}

	public void setCosphiFase2(Integer cosphiFase2) {
		this.cosphiFase2 = cosphiFase2;
	}

	public Integer getCorrenteFase3() {
		return this.correnteFase3;
	}

	public void setCorrenteFase3(Integer correnteFase3) {
		this.correnteFase3 = correnteFase3;
	}

	public Integer getTensioneFase3() {
		return this.tensioneFase3;
	}

	public void setTensioneFase3(Integer tensioneFase3) {
		this.tensioneFase3 = tensioneFase3;
	}

	public Integer getCosphiFase3() {
		return this.cosphiFase3;
	}

	public void setCosphiFase3(Integer cosphiFase3) {
		this.cosphiFase3 = cosphiFase3;
	}

	public Integer getThdFattDistorsione() {
		return this.thdFattDistorsione;
	}

	public void setThdFattDistorsione(Integer thdFattDistorsione) {
		this.thdFattDistorsione = thdFattDistorsione;
	}

	public Integer getPotAttivaFase1() {
		return this.potAttivaFase1;
	}

	public void setPotAttivaFase1(Integer potAttivaFase1) {
		this.potAttivaFase1 = potAttivaFase1;
	}

	public Integer getPotReattivaFase1() {
		return this.potReattivaFase1;
	}

	public void setPotReattivaFase1(Integer potReattivaFase1) {
		this.potReattivaFase1 = potReattivaFase1;
	}

	public Integer getPotApparenteFase1() {
		return this.potApparenteFase1;
	}

	public void setPotApparenteFase1(Integer potApparenteFase1) {
		this.potApparenteFase1 = potApparenteFase1;
	}

	public Integer getPotAttivaFase2() {
		return this.potAttivaFase2;
	}

	public void setPotAttivaFase2(Integer potAttivaFase2) {
		this.potAttivaFase2 = potAttivaFase2;
	}

	public Integer getPotReattivaFase2() {
		return this.potReattivaFase2;
	}

	public void setPotReattivaFase2(Integer potReattivaFase2) {
		this.potReattivaFase2 = potReattivaFase2;
	}

	public Integer getPotApparenteFase2() {
		return this.potApparenteFase2;
	}

	public void setPotApparenteFase2(Integer potApparenteFase2) {
		this.potApparenteFase2 = potApparenteFase2;
	}

	public Integer getPotAttivaFase3() {
		return this.potAttivaFase3;
	}

	public void setPotAttivaFase3(Integer potAttivaFase3) {
		this.potAttivaFase3 = potAttivaFase3;
	}

	public Integer getPotReattivaFase3() {
		return this.potReattivaFase3;
	}

	public void setPotReattivaFase3(Integer potReattivaFase3) {
		this.potReattivaFase3 = potReattivaFase3;
	}

	public Integer getPotApparenteFase3() {
		return this.potApparenteFase3;
	}

	public void setPotApparenteFase3(Integer potApparenteFase3) {
		this.potApparenteFase3 = potApparenteFase3;
	}

}