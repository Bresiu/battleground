package com.bresiu.battleground.application;

import com.bresiu.battleground.application.helpers.ArgsParser;
import com.bresiu.battleground.application.helpers.HtmlParser;
import com.bresiu.battleground.application.helpers.CharacterCounter;
import com.bresiu.battleground.application.helpers.UrlDownloader;
import com.bresiu.battleground.application.helpers.model.ArgsBundle;

import java.io.IOException;
import java.net.URL;

/**
 * @author Michal Brewczak
 */
public class Application {

	private ArgsParser argsParser;
	private UrlDownloader urlDownloader;
	private HtmlParser htmlParser;
	private CharacterCounter characterCounter;

	public Application() {
		this.argsParser = new ArgsParser();
		this.urlDownloader = new UrlDownloader();
		this.htmlParser = new HtmlParser();
		this.characterCounter = new CharacterCounter();
	}

	private void printResult(String[] args) throws IOException {
		ArgsBundle argsBundle = argsParser.parseArguments(args);
		URL url = argsBundle.getUrl();
		Character character = argsBundle.getCharacter();

		String html = this.urlDownloader.downloadUrl(url);
		String parsedHtml = this.htmlParser.parseHtmlForText(html);
		int numberOfLetter = characterCounter.count(character, parsedHtml);

		System.out.println("There is " + numberOfLetter + " \"" + character + "\" character in site: " + url.toString());
	}

	public static void main(String[] args) throws IOException {
		Application application = new Application();
		application.printResult(args);
	}
}