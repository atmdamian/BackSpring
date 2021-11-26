package com.softtek.web.app.repository.QuoteRestTemplate;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteServiceImpl implements QuoteService {

	
	@Override
	public List<QuoteDto> getQuote() {	
		RestTemplate restTemplate = new RestTemplate();

		QuoteDto quote  =restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", QuoteDto.class);
		return Arrays.asList(quote);
	}

}
