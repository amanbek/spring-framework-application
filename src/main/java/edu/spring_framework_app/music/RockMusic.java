package edu.spring_framework_app.music;

import org.springframework.beans.factory.annotation.Value;

public class RockMusic implements Music {
	private String [] trackNames;

	@ Override
	public String getSong () {
		return "AC/DC - Back in Black";
	}

	@ Value ("${rockMusic.trackNames}")
	public void setTrackNames (String [] trackName) {
		this.trackNames = trackName;
	}

	public String [] getTrackNames () {
		return trackNames;
	}

	@ Override
	public void getListOfTrackNames () {
		System.out.println ("List of rock music tracks: ");
		for (String trackName : trackNames) {
			System.out.println ("\t\t\t" + trackName);
		}
	}

}
