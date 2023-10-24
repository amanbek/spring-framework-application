package edu.stping_framework_app;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.stping_framework_app.entities.MusicPlayer;

public class Main {

	public static void main (String [] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("apllicationcontext.xml")) {

			MusicPlayer player = context.getBean ("music-player-1", MusicPlayer.class);
			player.playSong ();

			player = context.getBean ("music-player-2", MusicPlayer.class);
			player.playSong ();

			player = context.getBean ("music-player-3", MusicPlayer.class);
			player.playSong ();

		} catch (BeansException e) {
			e.printStackTrace ();
		}
	}

}
