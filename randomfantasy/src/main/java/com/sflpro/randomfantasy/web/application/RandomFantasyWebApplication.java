package com.sflpro.randomfantasy.web.application;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.sflpro.randomfantasy.web.pages.HomePage;

public class RandomFantasyWebApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

}
