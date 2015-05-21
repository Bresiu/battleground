package com.bresiu.battleground.application.helpers;

/**
 * @author Michal Brewczak
 */
public class CharacterCounter {
	public int count(Character character, String page) {
		int count = 0;
		for (int i = 0; i < page.length(); i++) {
			if (character == page.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
