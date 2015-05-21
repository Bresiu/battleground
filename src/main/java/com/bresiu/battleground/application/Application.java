package com.bresiu.battleground.application;

import com.bresiu.battleground.application.helpers.ArgsParser;
import com.bresiu.battleground.application.helpers.HtmlParser;
import com.bresiu.battleground.application.helpers.LetterCounter;
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
	private LetterCounter letterCounter;

	public Application() {
		this.argsParser = new ArgsParser();
		this.urlDownloader = new UrlDownloader();
		this.htmlParser = new HtmlParser();
		this.letterCounter = new LetterCounter();
	}

	private void printResult(String[] args) throws IOException {
		ArgsBundle argsBundle = argsParser.parseArguments(args);
		URL url = argsBundle.getUrl();
		Character letter = argsBundle.getCharacter();

		String html = this.urlDownloader.downloadUrl(url);
		String parsedHtml = this.htmlParser.parseHtmlForText(html);
		int numberOfLetter = letterCounter.countLetter(letter, parsedHtml);

		System.out.println("There is " + numberOfLetter + " \"" + letter + "\" letter in site: " + url.toString());
	}

	public static void main(String[] args) throws IOException {
		Application application = new Application();
		application.printResult(args);
	}
}