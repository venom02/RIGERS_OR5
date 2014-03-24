package com.rigers.db;

// Generated 24-mar-2014 14.44.56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MeterTermie generated by hbm2java
 */
public class MeterTermie implements java.io.Serializable {

	private MeterTermieId id;
	private Dispositivo dispositivo;
	private Date currentDateTime;
	private Integer currentEnergy;
	private Integer errorCode;
	private Integer currentTotalVolume;
	private Integer currentFlow;
	private Integer currentPerformance;
	private Integer returnFlowTemperature;
	private Integer temperatureDifference;
	private Integer currentImpulseCount1;
	private Integer currentImpulseCount2;

	public MeterTermie() {
	}

	public MeterTermie(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public MeterTermie(Dispositivo dispositivo, Date currentDateTime,
			Integer currentEnergy, Integer errorCode,
			Integer currentTotalVolume, Integer currentFlow,
			Integer currentPerformance, Integer returnFlowTemperature,
			Integer temperatureDifference, Integer currentImpulseCount1,
			Integer currentImpulseCount2) {
		this.dispositivo = dispositivo;
		this.currentDateTime = currentDateTime;
		this.currentEnergy = currentEnergy;
		this.errorCode = errorCode;
		this.currentTotalVolume = currentTotalVolume;
		this.currentFlow = currentFlow;
		this.currentPerformance = currentPerformance;
		this.returnFlowTemperature = returnFlowTemperature;
		this.temperatureDifference = temperatureDifference;
		this.currentImpulseCount1 = currentImpulseCount1;
		this.currentImpulseCount2 = currentImpulseCount2;
	}

	public MeterTermieId getId() {
		return this.id;
	}

	public void setId(MeterTermieId id) {
		this.id = id;
	}

	public Dispositivo getDispositivo() {
		return this.dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Date getCurrentDateTime() {
		return this.currentDateTime;
	}

	public void setCurrentDateTime(Date currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	public Integer getCurrentEnergy() {
		return this.currentEnergy;
	}

	public void setCurrentEnergy(Integer currentEnergy) {
		this.currentEnergy = currentEnergy;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getCurrentTotalVolume() {
		return this.currentTotalVolume;
	}

	public void setCurrentTotalVolume(Integer currentTotalVolume) {
		this.currentTotalVolume = currentTotalVolume;
	}

	public Integer getCurrentFlow() {
		return this.currentFlow;
	}

	public void setCurrentFlow(Integer currentFlow) {
		this.currentFlow = currentFlow;
	}

	public Integer getCurrentPerformance() {
		return this.currentPerformance;
	}

	public void setCurrentPerformance(Integer currentPerformance) {
		this.currentPerformance = currentPerformance;
	}

	public Integer getReturnFlowTemperature() {
		return this.returnFlowTemperature;
	}

	public void setReturnFlowTemperature(Integer returnFlowTemperature) {
		this.returnFlowTemperature = returnFlowTemperature;
	}

	public Integer getTemperatureDifference() {
		return this.temperatureDifference;
	}

	public void setTemperatureDifference(Integer temperatureDifference) {
		this.temperatureDifference = temperatureDifference;
	}

	public Integer getCurrentImpulseCount1() {
		return this.currentImpulseCount1;
	}

	public void setCurrentImpulseCount1(Integer currentImpulseCount1) {
		this.currentImpulseCount1 = currentImpulseCount1;
	}

	public Integer getCurrentImpulseCount2() {
		return this.currentImpulseCount2;
	}

	public void setCurrentImpulseCount2(Integer currentImpulseCount2) {
		this.currentImpulseCount2 = currentImpulseCount2;
	}

}
