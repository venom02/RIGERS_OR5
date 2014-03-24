package com.rigers.db;

// Generated 24-mar-2014 14.44.56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MeterAcqua generated by hbm2java
 */
public class MeterAcqua implements java.io.Serializable {

	private MeterAcquaId id;
	private Dispositivo dispositivo;
	private Integer currentReadoutValue;
	private Integer periodicReadoutValue;
	private Date periodicReadingDate;

	public MeterAcqua() {
	}

	public MeterAcqua(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public MeterAcqua(Dispositivo dispositivo, Integer currentReadoutValue,
			Integer periodicReadoutValue, Date periodicReadingDate) {
		this.dispositivo = dispositivo;
		this.currentReadoutValue = currentReadoutValue;
		this.periodicReadoutValue = periodicReadoutValue;
		this.periodicReadingDate = periodicReadingDate;
	}

	public MeterAcquaId getId() {
		return this.id;
	}

	public void setId(MeterAcquaId id) {
		this.id = id;
	}

	public Dispositivo getDispositivo() {
		return this.dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Integer getCurrentReadoutValue() {
		return this.currentReadoutValue;
	}

	public void setCurrentReadoutValue(Integer currentReadoutValue) {
		this.currentReadoutValue = currentReadoutValue;
	}

	public Integer getPeriodicReadoutValue() {
		return this.periodicReadoutValue;
	}

	public void setPeriodicReadoutValue(Integer periodicReadoutValue) {
		this.periodicReadoutValue = periodicReadoutValue;
	}

	public Date getPeriodicReadingDate() {
		return this.periodicReadingDate;
	}

	public void setPeriodicReadingDate(Date periodicReadingDate) {
		this.periodicReadingDate = periodicReadingDate;
	}

}