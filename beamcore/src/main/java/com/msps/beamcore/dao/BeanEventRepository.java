package com.msps.beamcore.dao;

import java.util.List;

import com.msps.beamcore.bean.BeamEventLog;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeanEventRepository extends MongoRepository<BeamEventLog, String>{
	
	public List<BeamEventLog> findByEventType(String eventType);
	public List<BeamEventLog> findByClientName(String clientName);
	public List<BeamEventLog> findByApplicationName(String applicationName);
	
}
