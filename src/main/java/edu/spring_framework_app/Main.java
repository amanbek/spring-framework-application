package edu.spring_framework_app;

import java.net.Socket;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring_framework_app.entities.MusicPlayer;
import edu.spring_framework_app.music.ClassicalMusic;
import edu.spring_framework_app.music.PopMusic;
import edu.spring_framework_app.music.RockMusic;

public class Main {

	public static void main (String [] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("apllicationcontext.xml")) {

			MusicPlayer musicPlayer = new MusicPlayer (
														context.getBean ("pop-music", PopMusic.class),
														context.getBean ("rock-music", RockMusic.class),
														context.getBean ("classical-music", ClassicalMusic.class));

			musicPlayer.playPlayList ();

			MusicPlayer musicPlayer_1 = context .getBean ("music-player", MusicPlayer.class)
												.addSongToPlayList (context.getBean ("pop-music", PopMusic.class), context.getBean ("rock-music", RockMusic.class), context.getBean ("classical-music", ClassicalMusic.class));

			musicPlayer_1.playPlayList ();
		} catch (BeansException e) {
			e.printStackTrace ();
		}
	}

}
