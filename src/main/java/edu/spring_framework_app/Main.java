package edu.spring_framework_app;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.spring_framework_app.configuration.AppConfiguration;
import edu.spring_framework_app.entities.MusicPlayer;

public class Main {

	public static void main (String [] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (
																									AppConfiguration.class)) {
			MusicPlayer musicPlayer = context.getBean ("musicPlayer", MusicPlayer.class);
			musicPlayer.getPlayerInfo ();
			musicPlayer.getListOfTrackNames ();

		} catch (BeansException e) {
			e.printStackTrace ();
		}
	}

}
