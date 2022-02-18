package br.com.acbueno.weatherforecast.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnalsysVO {
	
	@JsonProperty("descricao")
	private String description;
	
	@JsonProperty("data")
	private String data;

}
