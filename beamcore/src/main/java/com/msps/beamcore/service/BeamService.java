package com.msps.beamcore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msps.beamcore.bean.BeamEventLog;
import com.msps.beamcore.dao.BeanEventRepository;

@SpringBootApplication
@RestController
@EnableMongoRepositories(basePackages={"com.msps.beamcore"})
@RequestMapping("/beam")

public class BeamService {
	
	@Autowired
	private BeanEventRepository beamEventRepository;
	
	
	@RequestMapping("/")
	public String welcome(){
		return "Welcome To Beam";
	}
	
	@RequestMapping("/addEventLog")
	public String addEventLog(){
		return "Fetching the log....";
	}
	
	
	@RequestMapping("/fetchLog")
	public List<String> fetchLog(){
		List<String> result = new ArrayList<>();
		List<BeamEventLog> beamEventLogList = beamEventRepository.findAll();
		for(BeamEventLog beamEventLog : beamEventLogList){
			
			String logRes = beamEventLog.getEventStatus() + ":::"
					+ beamEventLog.getApplicationName() + ":::"
					+ beamEventLog.getEventTransId() + ":::"
					+ beamEventLog.getClientName() + ":::"
					+ beamEventLog.getStartTime();
			
			result.add(logRes);
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(BeamService.class, args);
	}

}
