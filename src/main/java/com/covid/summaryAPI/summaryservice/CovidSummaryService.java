package com.covid.summaryAPI.summaryservice;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import java.net.http.HttpClient;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.summaryAPI.summarymodel.SummaryModel;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class CovidSummaryService {
    private static final String SUMMARY_API_URL = "https://api.covid19api.com/summary";
    private static final String COUNTRY_WISE_DATA_API_URL = "https://api.covid19api.com/countries";
   // @Autowired
    //ObjectMapper objectMapper;
    // Please remove @PostConstruct annotation.
    // It's advisable to call this method explicitly.
    // This bean will slow down container start up time as API calls have to be fetched.
    // Check container start up time in console by
        // 1. Adding @PostConstruct annotation
        // 2. Removing @PostConstruct annotation.
    //@PostConstruct
    public SummaryModel fetchVirusData() throws IOException, InterruptedException {
        //HttpClient client = HttpClientBuilder.create().build();
        //HttpResponse response = client.execute(new HttpGet(SAMPLE_URL));
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(SUMMARY_API_URL))
                .build();

        HttpResponse<String> httpResponse = client.send(request, BodyHandlers.ofString());
        //System.out.println(httpResponse.statusCode());
        //System.out.println(httpResponse.body());

        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
        SummaryModel summary = objectMapper.readValue(httpResponse.body(), SummaryModel.class);
        
        System.out.println(summary);
        
        if (summary!=null)
        return summary;
        
        else 
        	return new SummaryModel();

    }
}


/*
@@ -74,7 +60,7 @@ public String getPostsPlainJSON() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        return this.restTemplate.getForObject(url, String.class);
	         */
	 //Asynchronous call     
//Asynchronous call
	/*WebClient client1 = WebClient
	 * .builder()*/