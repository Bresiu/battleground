package com.bresiu.battleground.application.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author Michal Brewczak
 */
public class UrlDownloader {
	public String downloadUrl(URL pageUrl) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(pageUrl.openStream()));

		String inputLine;
		StringBuilder pageBuilder = new StringBuilder();
		while ((inputLine = bufferedReader.readLine()) != null) {
			pageBuilder.append(inputLine);
		}
		bufferedReader.close();

		return pageBuilder.toString();
	}
}
