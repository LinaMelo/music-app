package org.com.co.api.music.web.controller;

import java.util.List;

import org.com.co.api.music.web.entity.Survey;
import org.com.co.api.music.web.service.ISurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired
	private ISurveyService surveyService;

	@GetMapping(value = "/{musicGenre}", produces = "application/json")
	@CrossOrigin
	@ResponseStatus(code = HttpStatus.OK)
	public List<Survey> findByMusicGenre(@PathVariable String musicGenre) {		
		return surveyService.findByMusicGenre(musicGenre);
	}
	
	
	@GetMapping(produces = "application/json")
	@CrossOrigin
	@ResponseStatus(code = HttpStatus.OK)
	public List<Survey> findAll() {		
		return surveyService.findAllSurveys();
	}
	
	@PostMapping(value = "/save", produces = "application/json", consumes = "application/json")
	@CrossOrigin
	@ResponseStatus(code = HttpStatus.CREATED)
	public Survey saveSurvey(@RequestBody Survey survey) {		
		return surveyService.saveSurvey(survey);
	}
}
