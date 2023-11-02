package edu.spring_framework_app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ Configuration

@ ComponentScan ("edu.spring_framework_app")
@ ComponentScan ("edu.spring_framework_app.entities")
@ ComponentScan ("edu.spring_framework_app.music")

@ PropertySource (ToConfigurate.PROPERTY_SOURCE)

public class ToConfigurate {
	static final String PROPERTY_SOURCE = "classpath:music-player.properties";

}
