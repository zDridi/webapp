package com.dridi.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class WebappApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	/**
	 * Récupérer la valeur de la propriété (com.dridi.webapp.apiUrl) dans le fichier de configuration application.properties,
	 * et l'afficher dans la cosole lors de l'exécution du projet
	 */
	@Autowired // Pour qu’un bean soit injecté dans un attribut
	private CustomProperties props;	// injection du bean CustomProperties

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Port de l' API : " + props.getApiUrl());	// Afficher la valeur de com.dridi.webapp.apiUrl , dans la console

	}

}
