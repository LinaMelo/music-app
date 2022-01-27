package org.com.co.api.music.web;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.com.co.api.music.web.entity.Survey;
import org.com.co.api.music.web.repository.ISurveyRepository;
import org.com.co.api.music.web.service.ISurveyService;
import org.com.co.api.music.web.util.Constantes;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SurveyServiceTest {
	@Autowired
	private ISurveyService surveyService;
	@MockBean
	private ISurveyRepository surveyRepository;


	@Before
	public void setup() {
		surveyRepository = mock(ISurveyRepository.class);
		surveyService = mock(ISurveyService.class);

	}

	@Test
	public void testFindAll() {
		List<Survey> surveys = new ArrayList<>();
		surveys.add(new Survey("juanhil@correo.com",Constantes.MUSIC_ROCK));
		surveys.add(new Survey("maria221@correo.com",Constantes.MUSIC_BLUES));
		surveys.add(new Survey("antonio890@correo.com",Constantes.MUSIC_POP));
		surveys.add(new Survey("alexky@correo.com",Constantes.MUSIC_ELECT));
		surveys.add(new Survey("lexluthor@correo.com",Constantes.MUSIC_CLASIC));
		surveys.add(new Survey("batman@correo.com",Constantes.MUSIC_ROCK));
		
		when(surveyRepository.findAll()).thenReturn(surveys);
		List<Survey> surveysTest = surveyService.findAllSurveys();
		assertNotNull(surveysTest);
		assertEquals(6, surveysTest.size());
		verify(surveyRepository,times(1)).findAll();
	}

	@Test
	public void findByMusicGenre() {
		
		List<Survey> surveyTest = new ArrayList<>();
		Survey survey = new Survey();
		survey.setEmail("fransc@correo.com");
		survey.setMusicGenre(Constantes.MUSIC_CLASIC);
		surveyTest.add(survey);
		when(surveyRepository.findByMusicGenre(Constantes.MUSIC_CLASIC)).thenReturn(surveyTest);
		List<Survey> surveyTest2 = surveyService.findByMusicGenre(Constantes.MUSIC_CLASIC);
		assertNotNull(surveyTest2);
		assertEquals(1, surveyTest2.size());
		verify(surveyRepository,times(1)).findByMusicGenre(Constantes.MUSIC_CLASIC);
	}
	
	@Test
	public void save() {
		Survey survey = new Survey();
		survey.setEmail("fransc@correo.com");
		survey.setMusicGenre(Constantes.MUSIC_CLASIC);
		when(surveyRepository.save(survey)).thenReturn(survey);
		Survey surveyTest = surveyService.saveSurvey(survey);
		assertNotNull(surveyTest);
		assertEquals(surveyTest.getEmail(),survey.getEmail());
		assertEquals(surveyTest.getMusicGenre(),survey.getMusicGenre());
		verify(surveyRepository,times(1)).save(survey);
	}
}
