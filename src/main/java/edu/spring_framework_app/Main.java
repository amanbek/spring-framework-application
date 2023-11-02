package edu.spring_framework_app;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring_framework_app.entities.MusicPlayer;
import edu.spring_framework_app.music.ClassicalMusic;
import edu.spring_framework_app.music.PopMusic;

public class Main {

	public static void main (String [] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("apllicationcontext.xml")) {

			System.out.println ("Initializing fields via music-player.properties file with anno.-s\n");

			var musicPlayer = context.getBean ("music-player-component", MusicPlayer.class);
			musicPlayer.getPlayerInfo ();

			ClassicalMusic classicalMusic = context.getBean ("classical-music-component", ClassicalMusic.class);
			ClassicalMusic classicalMusic_1 = context.getBean ("classical-music-component", ClassicalMusic.class);

			classicalMusic.setSongName ("TEST");
			classicalMusic_1.setSongName ("TEST_1");

			System.out.println (classicalMusic.getSongName ());
			System.out.println (classicalMusic_1.getSongName ());

			System.out.println ("Are these objects of ClassicalMusic class the same: "
					+ (classicalMusic_1 == classicalMusic) + "\n");

			PopMusic popMusic = context.getBean ("pop-music-component", PopMusic.class);
			PopMusic popMusic_1 = context.getBean ("pop-music-component", PopMusic.class);

			popMusic.setSongName ("TEST");
			popMusic_1.setSongName ("TEST_1");

			System.out.println (popMusic.getSongName ());
			System.out.println (popMusic_1.getSongName ());

			System.out.println ("Are these objects of PopMusic class the same: " + (popMusic == popMusic_1));
		} catch (BeansException e) {
			e.printStackTrace ();
		}
	}

}
