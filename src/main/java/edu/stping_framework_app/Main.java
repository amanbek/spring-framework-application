package edu.stping_framework_app;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.stping_framework_app.music.ClassicalMusic;

public class Main {

	public static void main (String [] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("apllicationcontext.xml")) {

			var classicalMusic = context.getBean ("classical-music-2", ClassicalMusic.class);
			System.out.println (classicalMusic.getSong ());		

		} catch (BeansException e) {
			e.printStackTrace ();
		}
	}

}
