package edu.stping_framework_app.entities;

import edu.stping_framework_app.music.Music;

public class MusicPlayer {
	private Music music;

	//Inversion of Control
	public MusicPlayer (Music music) {
		this.music = music;
	}
	
	public void playSong() {
		System.out.println ("Plays:" + this.music.getSong ());
	}

	public Music getMusic () {
		return music;
	}

	public void setMusic (Music music) {
		this.music = music;
	}
	
	
}
