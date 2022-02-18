package br.com.acbueno.weatherforecast.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StateCapitalVO {
	
	@JsonProperty("CAPITAL")
	private String capital;
	
	@JsonProperty("TMIN18")
	private String tmin18;
	
	@JsonProperty("TMAX18")
	private String tmax18;
	
	@JsonProperty("UMIN18")
	private String umin18;
	
	@JsonProperty("PMAX12")
	private String pmax12;

}
