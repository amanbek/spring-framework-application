package edu.spring_framework_app.music;

import org.springframework.stereotype.Component;

@ Component ("rock-music")
public class RockMusic implements Music {

	@ Override
	public String getSong () {
		return "AC/DC - Back in Black";
	}

}
