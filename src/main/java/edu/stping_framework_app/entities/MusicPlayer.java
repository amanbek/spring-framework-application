package edu.stping_framework_app.entities;

import edu.stping_framework_app.music.Music;

public class MusicPlayer {
	private Music  music;
	private String trackName;
	private int    volume;

	@ SuppressWarnings (value = { "unused" })
	private MusicPlayer () {
	}

	// Inversion of Control
	public MusicPlayer (Music music) {
		this.music = music;
	}

	public void getPlayerInfo () {
		System.out.println ("\ttrack's name: " + this.trackName);
		System.out.println ("\tvolume: " + this.volume);
	}

	public void playSong () {
		System.out.println ("Plays: " + this.music.getSong ());
	}

	public Music getMusic () {
		return music;
	}

	public void setMusic (Music music) {
		this.music = music;
	}

	public String getTrackName () {
		return trackName;
	}

	public void setTrackName (String trackName) {
		this.trackName = trackName;
	}

	public int getVolume () {
		return volume;
	}

	public void setVolume (int volume) {
		this.volume = volume;
	}

}
