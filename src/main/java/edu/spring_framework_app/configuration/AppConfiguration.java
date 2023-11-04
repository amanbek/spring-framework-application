package edu.spring_framework_app.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.spring_framework_app.entities.MusicPlayer;
import edu.spring_framework_app.music.ClassicalMusic;
import edu.spring_framework_app.music.PopMusic;
import edu.spring_framework_app.music.RockMusic;

@ Configuration
@ PropertySource (AppConfiguration.PROPERTY_SOURCE)

public class AppConfiguration {
	static final String            PROPERTY_SOURCE = "classpath:music-player.properties";
	
	@ Value ("${classicalMusic_1.trackNames}")
	private static final String [] trackNames_1    = null;
	
	@ Value ("${classicalMusic_2.trackNames}")
	private static final String [] trackNames_2    = null;

	@ Bean
	public ClassicalMusic classicalMusic_1 () {
		return createClassicalMusicBeanWithStringValue (trackNames_1);
	}

	@ Bean
	public ClassicalMusic classicalMusic_2 () {
		return createClassicalMusicBeanWithStringValue (trackNames_2);
	}

	@ Bean
	public PopMusic popMusic () {
		return new PopMusic ();
	}

	@ Bean
	public RockMusic rockMusic () {
		return new RockMusic ();
	}

	@ Bean
	public MusicPlayer musicPlayer () {
		return new MusicPlayer (classicalMusic_1 (), classicalMusic_2 (), rockMusic (), popMusic ());
	}

	public ClassicalMusic createClassicalMusicBeanWithStringValue (String [] value) {
		var temp = new ClassicalMusic ();
		temp.setTrackNames (value);
		return temp;
	}
}
