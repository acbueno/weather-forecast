package br.com.acbueno.weatherforecast.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityVO {
	
	@JsonProperty("nome")
	private String name;
	
	@JsonProperty("municipio")
	private Municipio municipio;
	

}
