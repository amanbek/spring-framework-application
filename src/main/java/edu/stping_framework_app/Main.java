package edu.stping_framework_app;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.stping_framework_app.entities.MusicPlayer;

public class Main {

	public static void main (String [] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("apllicationcontext.xml")) {

			MusicPlayer player = context.getBean ("music-player-1", MusicPlayer.class);
			player.playSong ();
			player.getPlayerInfo ();

		} catch (BeansException e) {
			e.printStackTrace ();
		}
	}

}
