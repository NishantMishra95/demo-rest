package com.nishant.restdemo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nishant.restdemo.model.Person;

@RestController
public class PersonController {

	@Autowired
	private RestTemplate restTemplate;
	

	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public String createPerson(@Validated @RequestBody Person person) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Person> entity = new HttpEntity<Person>(person, headers);
		System.out.println(person);
		
		return restTemplate.exchange(
		         "https://serene-spire-67366.herokuapp.com/rest/postaccout-json", HttpMethod.POST, entity, String.class).getBody();
	}

}
