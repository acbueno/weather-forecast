package br.com.acbueno.weatherforecast.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CityWeatherForecastServices {

	@Autowired
	private CityService cityService;

	@Value("${api.url.city.name}")
	private String urlApiByCode;

	@Autowired
	private RestTemplate restTemplate;

	public String getCityByName(String name)  {
		String response = null;
		try {
			String searchCodeByName = cityService.searchCodeByName(name);
			String urlByCity = urlApiByCode + "/" +  searchCodeByName;
			response = restTemplate.getForObject(urlByCity, String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}
	


	
	
	
	
}
