package edu.spring_framework_app.music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ Component ("pop-music-component")
@ Scope ("prototype")
public class PopMusic implements Music {
	private String songName;

	@ Override
	public String getSong () {
		return "Lady Gaga - Paparazi";
	}

	@ PostConstruct
	public void init () {
		System.out.println ("Bean of PopMusic class has been initialized successfully!");
	}

	@ PreDestroy
	public void destr () {
		System.out.println ("Bean of PopMusic class has been destroyed successfully!");
	}

	public String getSongName () {
		return songName;
	}

	public void setSongName (String songName) {
		this.songName = songName;
	}

}
