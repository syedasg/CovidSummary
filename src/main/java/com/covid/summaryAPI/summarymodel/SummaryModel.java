package com.covid.summaryAPI.summarymodel;

import java.util.List;

import com.covid.summaryAPI.summarymodel.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryModel {
		 	@JsonProperty("Global")
		    private GlobalBean global;

		    @JsonProperty("Countries")
		    private List<CountryBean> countries;

		    @JsonProperty("Date")
		    private String date;

			@Override
			public String toString() {
				return "SummaryModel [global=" + global + ", countries=" + countries + ", date=" + date + "]";
			}

			public GlobalBean getGlobal() {
				return global;
			}

			public void setGlobal(GlobalBean global) {
				this.global = global;
			}

			public List<CountryBean> getCountries() {
				return countries;
			}

			public void setCountries(List<CountryBean> countries) {
				this.countries = countries;
			}

			public String getDate() {
				return date;
			}

			public void setDate(String date) {
				this.date = date;
			}
}