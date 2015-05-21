package com.bresiu.battleground.application.helpers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author Michal Brewczak
 */
public class HtmlParser {
	public String parseHtmlForText(String html) {
		Document parsedDocument = Jsoup.parse(html);
		return parsedDocument.body().text();
	}
}
