package org.com.co.api.music.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
/**
 * Clase de configuración para el cliente de mongo
 * @author Lmelo
 *
 */
@Configuration
public class MongoConfig {

	@Bean
	public MongoClient mongo() {

		ConnectionString connectionString = new ConnectionString("mongodb+srv://mon_admin:4dmM0n6@cluster0.d44vm.mongodb.net/music_db");
		MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(connectionString).build();
		return MongoClients.create(settings);
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongo(), "music_db");
	}
}
