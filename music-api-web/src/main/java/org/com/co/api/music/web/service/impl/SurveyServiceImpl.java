package org.com.co.api.music.web.service.impl;

import java.util.List;

import org.com.co.api.music.web.entity.Survey;
import org.com.co.api.music.web.repository.ISurveyRepository;
import org.com.co.api.music.web.service.ISurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImpl implements ISurveyService {

	@Autowired
	private ISurveyRepository iSurveyRepository;
	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public List<Survey> findByMusicGenre(String musicGenre) {
		return iSurveyRepository.findByMusicGenre(musicGenre);
	}

	@Override
	public List<Survey> findAllSurveys() {
		return iSurveyRepository.findAll();
	}

	@Override
	public Survey saveSurvey(Survey survey) {
		return iSurveyRepository.save(survey);
	}
}
