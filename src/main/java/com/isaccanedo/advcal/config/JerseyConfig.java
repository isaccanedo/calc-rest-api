package com.isaccanedo.advcal.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("api")
@Component
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		packages("com.isaccanedo.advcal.res");
	}
}
