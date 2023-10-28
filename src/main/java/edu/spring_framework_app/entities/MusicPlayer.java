package edu.spring_framework_app.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import edu.spring_framework_app.music.Music;


@ Component ("music-player")
public class MusicPlayer {
	private Music       music;
	private String      trackName;
	private int         volume;
	private String      model;
	private List<Music> playList = new ArrayList<Music> ();

	@ SuppressWarnings (value = { "unused" })
	private MusicPlayer () {
	}

	// Inversion of Control
	public MusicPlayer (Music music) {
		this.music = music;
	}

	public MusicPlayer (Music... musics) {
		this.playList = Arrays.asList (musics);
	}

	public void getPlayerInfo () {
		System.out.println ("\t----**Players characteristics**----");
		System.out.println ("\t\ttrack's name: " + this.trackName);
		System.out.println ("\t\tmodel: " + this.model);
		System.out.println ("\t\tvolume: " + this.volume);
	}

	public void playSong () {
		System.out.println ("Plays: " + this.music.getSong ());
	}

	public void playPlayList () {
		System.out.println ("Plays:");
		for (Music music : playList) {
			System.out.println ("\t" + music.getSong ());
		}
	}

	public MusicPlayer addSongToPlayList (Music... musics) {
		MusicPlayer mp = new MusicPlayer ();

		mp.playList.addAll (Arrays.asList (musics));
		
		return mp;

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

	public List<Music> getPlayList () {
		return playList;
	}

	public void setPlayList (List<Music> playList) {
		this.playList = playList;
	}

	public String getModel () {
		return model;
	}

	public void setModel (String model) {
		this.model = model;
	}

	@ Override
	public int hashCode () {
		return Objects.hash (music, playList, trackName, volume);
	}

	@ Override
	public boolean equals (Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass () != obj.getClass ()) return false;
		MusicPlayer other = (MusicPlayer)obj;
		return Objects.equals (music, other.music) && Objects.equals (playList, other.playList)
				&& Objects.equals (trackName, other.trackName) && volume == other.volume;
	}

}
