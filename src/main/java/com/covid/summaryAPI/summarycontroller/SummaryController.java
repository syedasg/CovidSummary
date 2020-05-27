package com.covid.summaryAPI.summarycontroller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covid.summaryAPI.summarymodel.SummaryModel;
import com.covid.summaryAPI.summaryservice.CovidSummaryService;

@RestController
public class SummaryController {

@Autowired
CovidSummaryService covidSummaryService;

@GetMapping("/summary")
	public SummaryModel getSummary() 
	{

			try {
				return covidSummaryService.fetchVirusData();
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	return new SummaryModel(); 

	}
@RequestMapping("/hello")
		    public String home(){
		        return "Hello World!";		
	
	}
	
}
