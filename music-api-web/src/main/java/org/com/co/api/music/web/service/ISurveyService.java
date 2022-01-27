package org.com.co.api.music.web.service;

import java.util.List;
import org.com.co.api.music.web.entity.Survey;
/**
 * Interfaz de los metodos que se implementaran para los servicios de la coleccion encuestas.
 * @author Lmelo
 *
 */

public interface ISurveyService {
	List<Survey> findByMusicGenre(String musicGenre);
	List<Survey> findAllSurveys();
	Survey saveSurvey(Survey survey);
	
}
