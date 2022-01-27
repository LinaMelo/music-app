package org.com.co.api.music.web.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * Clase que representa una coleccion de respuesta a una encuesta. Contiene los constructores getters y setters
 * @author Lina melo
 *
 */
@Document(collection = "surveys")
public class Survey {

	@Id
	private String id;
	@Indexed(unique=true)
	private String email;
	private String musicGenre;
	
	public Survey() {
		// TODO Auto-generated constructor stub
	}
	
	public Survey(String email, String musicGenre) {
		this.email = email;
		this.musicGenre = musicGenre;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMusicGenre() {
		return musicGenre;
	}
	public void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}
	
}
