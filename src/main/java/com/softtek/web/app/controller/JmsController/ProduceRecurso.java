package com.softtek.web.app.controller.JmsController;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/publicar")
@Api(value = "Mensajeria Controller", description = "Mensajeria ActiveMQ")

public class ProduceRecurso {
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	@GetMapping("/{mensaje}")
	public String publicar(@PathVariable("mensaje") final String mensaje) {
		
		jmsTemplate.convertAndSend(queue, mensaje);
		return "Publicacion Exitosa!";
		
	}

}
