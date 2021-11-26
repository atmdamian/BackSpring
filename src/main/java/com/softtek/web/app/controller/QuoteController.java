package com.softtek.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.web.app.repository.QuoteRestTemplate.QuoteDto;
import com.softtek.web.app.repository.QuoteRestTemplate.QuoteService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/quote")
@CrossOrigin
@Api(value = "Quote Controller", description = "Administrar Quote RestTemplate")
public class QuoteController {
	@Autowired
	private QuoteService quoteService;

	@GetMapping
	public List<QuoteDto> calcularQuoteRestTemplate() {
		return quoteService.getQuote();
	}
	
}
