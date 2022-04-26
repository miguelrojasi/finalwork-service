/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.api.DemoResponse;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author miguel
 */
@RestController
public class DemoController {

	@GetMapping("/keepAlive")
	public ResponseEntity<DemoResponse> keepAlive() {
		DemoResponse demoResponse = new DemoResponse().setReference("Service is Alive").setTimestamp(new Date());
		return new ResponseEntity(demoResponse, HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity root() {
		return new ResponseEntity(new Date().toString(), HttpStatus.OK);
	}
	
}