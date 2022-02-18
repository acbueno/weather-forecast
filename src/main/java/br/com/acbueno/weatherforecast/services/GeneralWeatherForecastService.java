package br.com.acbueno.weatherforecast.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.acbueno.weatherforecast.vo.AnalsysVO;

@Service
public class GeneralWeatherForecastService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.url.general.weather.forecast}")
	private String urlApiGeneralWeatherForecast;
	
	public List<AnalsysVO> getGeneralWeatherForecast(){
		AnalsysVO[] response = restTemplate.getForObject(urlApiGeneralWeatherForecast, AnalsysVO[].class);
		
		return Arrays.asList(response);
	}

}
