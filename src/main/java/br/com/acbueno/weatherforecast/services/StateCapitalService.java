package br.com.acbueno.weatherforecast.services;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import br.com.acbueno.weatherforecast.vo.StateCapitalVO;

@Service
public class StateCapitalService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value( "${api.url.state.capital}" )
	private String urlApi;
	
	public List<StateCapitalVO> getWetherForecastStateCapital() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		Date dateNow = new Date(System.currentTimeMillis());
		String dateNowFormatt = formatter.format(dateNow);
		String urlApiToday = urlApi+dateNowFormatt;
		StateCapitalVO[] response = restTemplate.getForObject(urlApiToday, StateCapitalVO[].class);
		return Arrays.asList(response);
	}

}
