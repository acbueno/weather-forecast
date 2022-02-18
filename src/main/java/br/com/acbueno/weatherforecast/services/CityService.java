package br.com.acbueno.weatherforecast.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.acbueno.weatherforecast.vo.CityVO;

@Service
public class CityService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${api.url.city.code}")
	private String urlApiCity;

	private Map<String, String> mapCity = new HashMap<>();

	public CityService() {
		
	}

	private List<CityVO> getAllCityGeoCode() {
		CityVO[] response = restTemplate.getForObject(urlApiCity, CityVO[].class);
		return Arrays.asList(response);
	}

	private void addMapCityCode() {
	List<CityVO> allCityGeoCode = getAllCityGeoCode();
		allCityGeoCode.forEach(c -> {
			mapCity.put(c.getMunicipio().getNome(), c.getMunicipio().getId());
		});
	}

	public String searchCodeByName(String name) {
		if(mapCity.isEmpty()) {
			addMapCityCode();
		}
		if (mapCity.containsKey(name)) {
			return mapCity.get(name);
		}
		return "Not Found";
	}
	
	public Map<String, String> getMap() {
        if(mapCity.isEmpty()) {
        	addMapCityCode();
        }
		return this.mapCity;
	}

}
