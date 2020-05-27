package com.covid.summaryAPI;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.covid.summaryAPI.summarymodel.CountryBean;
import com.covid.summaryAPI.summarymodel.GlobalBean;
import com.covid.summaryAPI.summarymodel.SummaryModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SummaryApiApplicationTests {

	@Test
	void contextLoads() {
	}
	    private ObjectMapper objectMapper = new ObjectMapper();

	    @Test
	    public void convertResponse() throws JsonProcessingException {
	        SummaryModel summaryModel = objectMapper.readValue(getSampleSummaryResponse(), SummaryModel.class);
	        assertThat(summaryModel.getDate()).isEqualTo("2020-04-30T00:24:26Z");

	        List<CountryBean> countries = summaryModel.getCountries();
	        assertThat(countries).isNotNull();
	        assertThat(countries).isNotEmpty();
	        CountryBean country = countries.get(0);
	        assertThat(country.getCountry()).isEqualTo("ALA Aland Islands");
	        assertThat(country.getCountryCode()).isEqualTo("AX");
	        assertThat(country.getSlug()).isEqualTo("ala-aland-islands");
	        assertThat(country.getCountry()).isEqualTo("ALA Aland Islands");
	        assertThat(country.getNewConfirmed()).isEqualTo(0);
	        assertThat(country.getTotalConfirmed()).isEqualTo(0);
	        assertThat(country.getNewDeaths()).isEqualTo(0);
	        assertThat(country.getTotalDeaths()).isEqualTo(0);
	        assertThat(country.getNewRecovered()).isEqualTo(0);
	        assertThat(country.getTotalRecovered()).isEqualTo(0);
	        assertThat(country.getDate()).isEqualTo("2020-04-30T00:24:26Z");

	        assertThat(summaryModel.getGlobal()).isNotNull();
	        GlobalBean global = summaryModel.getGlobal();
	        assertThat(global.getNewConfirmed()).isEqualTo(75128);
	        assertThat(global.getTotalConfirmed()).isEqualTo(3098828);
	        assertThat(global.getNewDeaths()).isEqualTo(5973);
	        assertThat(global.getTotalDeaths()).isEqualTo(216658);
	        assertThat(global.getNewRecovered()).isEqualTo(34644);
	        assertThat(global.getTotalRecovered()).isEqualTo(925285);
	    }

	    private String getSampleSummaryResponse() {
	        return "{\n" +
	                "\t\"Global\": {\n" +
	                "\t\t\"NewConfirmed\": 75128,\n" +
	                "\t\t\"TotalConfirmed\": 3098828,\n" +
	                "\t\t\"NewDeaths\": 5973,\n" +
	                "\t\t\"TotalDeaths\": 216658,\n" +
	                "\t\t\"NewRecovered\": 34644,\n" +
	                "\t\t\"TotalRecovered\": 925285\n" +
	                "\t},\n" +
	                "\t\"Countries\": [{\n" +
	                "\t\t\t\"Country\": \"ALA Aland Islands\",\n" +
	                "\t\t\t\"CountryCode\": \"AX\",\n" +
	                "\t\t\t\"Slug\": \"ala-aland-islands\",\n" +
	                "\t\t\t\"NewConfirmed\": 0,\n" +
	                "\t\t\t\"TotalConfirmed\": 0,\n" +
	                "\t\t\t\"NewDeaths\": 0,\n" +
	                "\t\t\t\"TotalDeaths\": 0,\n" +
	                "\t\t\t\"NewRecovered\": 0,\n" +
	                "\t\t\t\"TotalRecovered\": 0,\n" +
	                "\t\t\t\"Date\": \"2020-04-30T00:24:26Z\"\n" +
	                "\t\t}],\n" +
	                "\t\"Date\": \"2020-04-30T00:24:26Z\"\n" +
	                "}";
	    }

	}
	
	

