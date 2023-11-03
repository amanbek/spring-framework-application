package edu.spring_framework_app.music;

// import javax.annotation.PostConstruct;
// import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {
	private String [] trackNames;

	@ Override
	public String getSong () {
		return "Liszt - Hungarian Rhapsody No. 2";
	}

	public static ClassicalMusic getInstance () {
		return new ClassicalMusic ();
	}

	public String [] getTrackNames () {
		return trackNames;
	}

	public void setTrackNames (String [] trackNames) {
		this.trackNames = trackNames;
	}

	@ Override
	public void getListOfTrackNames () {
		System.out.println ("List of classical music tracks: ");
		for (String trackName : trackNames) {
			System.out.println ("\t\t\t" + trackName);
		}
	}
}