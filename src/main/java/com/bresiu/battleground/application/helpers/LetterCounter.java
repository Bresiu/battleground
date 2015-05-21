package com.bresiu.battleground.application.helpers;

/**
 * @author Michal Brewczak
 */
public class LetterCounter {
	public int countLetter(Character letter, String page) {
		int count = 0;
		for (int i = 0; i < page.length(); i++) {
			if (letter == page.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
