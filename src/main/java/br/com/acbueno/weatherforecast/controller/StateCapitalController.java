package br.com.acbueno.weatherforecast.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.acbueno.weatherforecast.services.CityService;
import br.com.acbueno.weatherforecast.services.CityWeatherForecastServices;
import br.com.acbueno.weatherforecast.services.GeneralWeatherForecastService;
import br.com.acbueno.weatherforecast.services.StateCapitalService;
import br.com.acbueno.weatherforecast.vo.AnalsysVO;
import br.com.acbueno.weatherforecast.vo.StateCapitalVO;

@RestController
@RequestMapping("/api/weatherforecast")
public class StateCapitalController {

	@Autowired
	private StateCapitalService stateCapitalService;
	
	@Autowired
	private GeneralWeatherForecastService generalWeatherForecastService;
	
	@Autowired
	private CityService cityervice;
	
	@Autowired
	private CityWeatherForecastServices cityWeatherForecastServices;
	
	@GetMapping(path = "/statecapital")
	public List<StateCapitalVO> getWetherForecastByStateCapital() {
		List<StateCapitalVO> wetherForecastStateCapital = stateCapitalService.getWetherForecastStateCapital();
		return wetherForecastStateCapital;
	}
	
	@GetMapping(path = "/general")
	public List<AnalsysVO> getWeatherForecastByGeneralAnalsys(){
		List<AnalsysVO> generalAnalsys = generalWeatherForecastService.getGeneralWeatherForecast();
		return generalAnalsys;
	}
	
	@GetMapping(path = "/code/{name}")
	public String getAllCity(@PathVariable("name") String name){
	  String geoCode = cityervice.searchCodeByName(name);
	  return geoCode;
	}
		
	@GetMapping(path = "/city/{name}")
	public String getForecastByGeoCode(@PathVariable("name") String name) throws IOException {
		String geoCodeVO = cityWeatherForecastServices.getCityByName(name);
		return geoCodeVO;

	}
	
	@GetMapping(path = "/city/map")
	public Map<String, String> getMapCity(){
		return cityervice.getMap();
	}

}
