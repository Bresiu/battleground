package com.bresiu.battleground.application.helpers;

import com.bresiu.battleground.application.helpers.consts.Constants;
import com.bresiu.battleground.application.helpers.model.ArgsBundle;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Michal Brewczak
 */
public class ArgsParser {
	public ArgsBundle parseArguments(String[] args) throws MalformedURLException {
		return validateArgsOrGetDefault(args);
	}

	private ArgsBundle validateArgsOrGetDefault(String[] args) throws MalformedURLException {
		if (args.length == 2) {
			Character character = parseChar(args[0]);
			URL url = parseUrl(args[1]);

			if (character != null && url != null) {
				return new ArgsBundle(character, url);
			}
		}
		return getDefaultArgs();
	}


	private Character parseChar(String arg) {
		if (arg.length() == 1) {
			return arg.charAt(0);
		}
		return null;
	}

	private URL parseUrl(String urlAddress) throws MalformedURLException {
		try {
			return new URL(urlAddress);
		} catch (MalformedURLException ignored) {
			return new URL(Constants.DEFAULT_URL_ADDRESS);
		}
	}

	private ArgsBundle getDefaultArgs() throws MalformedURLException {
		return new ArgsBundle(Constants.DEFAULT_CHARACTER, parseUrl(Constants.DEFAULT_URL_ADDRESS));
	}
}
