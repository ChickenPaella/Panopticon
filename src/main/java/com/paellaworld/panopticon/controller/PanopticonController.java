package com.paellaworld.panopticon.controller;

import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paellaworld.panopticon.service.PanopticonService;

@RestController(value="/")
public class PanopticonController {
	
	@Autowired
	PanopticonService panopticonService;
	
	@GetMapping(value="hello")
	public ResponseEntity<String> test() {
		Document doc = panopticonService.getDocument();
		String resultBody = doc.toString();
		return new ResponseEntity<>(resultBody, HttpStatus.OK);
	}
}
