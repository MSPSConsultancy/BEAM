
package com.msps.beamcore.bean;

import org.springframework.data.annotation.Id;

public class BeamEventLog {
	
	@Id
	public String id;
	
	public String eventTransId;
	public String eventType;
	public String eventStatus;
	public String eventState;
	public String startTime;
	public String endTime;
	public String errorType;
	public String messageDetail;
	
	
	public String applicationName;
	public String clientName;
	public String clientIp;
	public String serverIp;
	public String module;
	
	
	public String getEventTransId() {
		return eventTransId;
	}
	public void setEventTransId(String eventTransId) {
		this.eventTransId = eventTransId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventStatus() {
		return eventStatus;
	}
	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}
	public String getEventState() {
		return eventState;
	}
	public void setEventState(String eventState) {
		this.eventState = eventState;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getMessageDetail() {
		return messageDetail;
	}
	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getServerIp() {
		return serverIp;
	}
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}

	
	
}
