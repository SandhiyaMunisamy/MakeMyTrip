package com.atmecs.application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.Passenger.Passenger;
/**
 * 
 * @author Sandhiya.Munisamy
 *
 */
@RestController
public class Controller {

	@PostMapping(path="/passenger-info")
	public String PassengerInformation(@RequestBody Passenger pass) 
	{

		return "Passenger information saved successfully ::."+ pass.getPassengerName()+ " " +pass.getage()+ " " +pass.getdepartFrom()+ " " +pass.getarriveAt();
	}
}


