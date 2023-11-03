package edu.spring_framework_app.music;

import org.springframework.beans.factory.annotation.Value;

public class PopMusic implements Music {
	@ Value ("${popMusic.trackNames}")
	private String [] trackNames;

	public String [] getTrackNames () {
		return trackNames;
	}

	public void setTrackNames (String [] trackName) {
		this.trackNames = trackName;
	}

	@ Override
	public String getSong () {
		return "Lady Gaga - Paparazi";
	}

	@ Override
	public void getListOfTrackNames () {
		System.out.println ("List of pop music tracks: ");
		for (String trackName : trackNames) {
			System.out.println ("\t\t\t" + trackName);
		}
	}

}
