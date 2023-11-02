package edu.spring_framework_app.music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ Component ("classical-music-component")
@ Scope("singleton")
public class ClassicalMusic implements Music {
	private String songName;

	private ClassicalMusic () {
	}

	@ Override
	public String getSong () {
		return "Liszt - Hungarian Rhapsody No. 2";
	}
	
	@PostConstruct
	public void doMyInit () {
		System.out.println ("Bean of ClassicalMusic class has been initialized successfully!");
	}

	@PreDestroy
	public void doMyDestroy () {
		System.out.println ("Bean of ClassicalMusic class has been destroyed successfully!");
	}

	public static ClassicalMusic getInstance () {
		return new ClassicalMusic ();
	}

	public String getSongName () {
		return songName;
	}

	public void setSongName (String songName) {
		this.songName = songName;
	}
}