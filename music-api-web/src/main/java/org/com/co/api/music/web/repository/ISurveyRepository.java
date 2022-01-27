package org.com.co.api.music.web.repository;

import java.util.List;

import org.com.co.api.music.web.entity.Survey;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Clase que implementa el repositorio de mongo para realizar consultas y operaciones sobre la coleccion 
 * de encuestas.
 * @author Lmelo
 *
 */

public interface ISurveyRepository extends MongoRepository<Survey, String>{

	List<Survey> findByMusicGenre(String musicGenre);
	
}
