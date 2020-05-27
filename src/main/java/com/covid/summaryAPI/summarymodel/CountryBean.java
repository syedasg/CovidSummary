package com.covid.summaryAPI.summarymodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
	public class CountryBean {
		@JsonProperty("Country")
		String country;
		@JsonProperty("CountryCode")
		String countryCode;
		@JsonProperty("Slug")
		String slug;
	    @JsonProperty("NewConfirmed")
	    int newConfirmed;
	    @JsonProperty("TotalConfirmed")
	    int totalConfirmed;
	    @JsonProperty("NewDeaths")
	    int newDeaths;
	    @JsonProperty("TotalDeaths")
	    int totalDeaths;
	    @JsonProperty("NewRecovered")
	    int newRecovered;
	    @JsonProperty("TotalRecovered")
	    int totalRecovered;
	    @JsonProperty("Date")
	    String date;

	    public int getNewConfirmed() {
	        return newConfirmed;
	    }

	    public void setNewConfirmed(int newConfirmed) {
	        this.newConfirmed = newConfirmed;
	    }

	    public int getTotalConfirmed() {
	        return totalConfirmed;
	    }

	    public void setTotalConfirmed(int totalConfirmed) {
	        this.totalConfirmed = totalConfirmed;
	    }

	    public int getNewDeaths() {
	        return newDeaths;
	    }

	    public void setNewDeaths(int newDeaths) {
	        this.newDeaths = newDeaths;
	    }

	    public int getTotalDeaths() {
	        return totalDeaths;
	    }

	    public void setTotalDeaths(int totalDeaths) {
	        this.totalDeaths = totalDeaths;
	    }

	    public int getNewRecovered() {
	        return newRecovered;
	    }

	    public void setNewRecovered(int newRecovered) {
	        this.newRecovered = newRecovered;
	    }

	    public int getTotalRecovered() {
	        return totalRecovered;
	    }

	    public void setTotalRecovered(int totalRecovered) {
	        this.totalRecovered = totalRecovered;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public String getCountryCode() {
	        return countryCode;
	    }

	    public void setCountryCode(String countryCode) {
	        this.countryCode = countryCode;
	    }

	    public String getSlug() {
	        return slug;
	    }

	    public void setSlug(String slug) {
	        this.slug = slug;
	    }

	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }

	    @Override
	    public String toString() {
	        return "Country [Country=" + country + ", CountryCode=" + countryCode + ", Slug=" + slug
	                + ", NewConfirmed=" + newConfirmed + ", TotalConfirmed=" + totalConfirmed + ", NewDeaths="
	                + newDeaths + ", TotalDeaths=" + totalDeaths + ", NewRecovered=" + newRecovered
	                + ", TotalRecovered=" + totalRecovered + ", date=" + date + "]";
	    }

	} 

