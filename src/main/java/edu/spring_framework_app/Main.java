package edu.spring_framework_app;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.spring_framework_app.configuration.ToConfigurate;
import edu.spring_framework_app.entities.MusicPlayer;

public class Main {

	public static void main (String [] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (
																									ToConfigurate.class)) {
			MusicPlayer musicPlayer = context.getBean ("music-player-component", MusicPlayer.class);
			musicPlayer.getPlayerInfo ();
			
		} catch (BeansException e) {
			e.printStackTrace ();
		}
	}

}
