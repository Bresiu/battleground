package com.bresiu.battleground.application.helpers.model;

import java.net.URL;

/**
 * @author Michal Brewczak
 */
public class ArgsBundle {
	private Character character;
	private URL url;

	public ArgsBundle(Character character, URL url) {
		this.character = character;
		this.url = url;
	}

	public Character getCharacter() {
		return this.character;
	}

	public URL getUrl() {
		return this.url;
	}
}
