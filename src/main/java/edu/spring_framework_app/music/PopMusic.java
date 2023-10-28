package edu.spring_framework_app.music;

import org.springframework.stereotype.Component;

@ Component ("pop-music")
public class PopMusic implements Music {

	@ Override
	public String getSong () {
		return "Lady Gaga - Paparazi";
	}
}
