package edu.stping_framework_app;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.stping_framework_app.entities.MusicPlayer;
import edu.stping_framework_app.music.ClassicalMusic;
import edu.stping_framework_app.music.Music;
import edu.stping_framework_app.music.PopMusic;
import edu.stping_framework_app.music.RockMusic;


public class Main {

	public static void main (String [] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("apllicationcontext.xml")) {
			Music obj = context.getBean ("classical-music-1", ClassicalMusic.class);
			System.out.println (obj.getSong ());
			obj = context.getBean ("rock-music-1", RockMusic.class);
			System.out.println (obj.getSong ());
			obj = context.getBean ("pop-music-1", PopMusic.class);
			System.out.println (obj.getSong ());
			
			MusicPlayer player = new MusicPlayer (obj);
			player.playSong ();
		} catch (BeansException e) {
			e.printStackTrace ();
		}
	}

}
