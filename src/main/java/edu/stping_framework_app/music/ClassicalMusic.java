package edu.stping_framework_app.music;

public class ClassicalMusic implements Music {

	@ Override
	public String getSong () {
		return "Liszt - Hungarian Rhapsody No. 2";
	}
	
	public void doMyInit() {
		System.out.println ("Initialization is done successfully!");
	}
	
	public void doMyDestroy() {
		System.out.println ("Bean Destroyed successfully!");
	}
}