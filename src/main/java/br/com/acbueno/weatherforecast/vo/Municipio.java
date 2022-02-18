package br.com.acbueno.weatherforecast.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Municipio {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("nome")
	private String nome;

}
