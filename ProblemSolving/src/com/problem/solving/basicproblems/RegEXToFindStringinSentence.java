package com.problem.solving.basicproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEXToFindStringinSentence {
	
	public static void main(String [] args) {
		String sentence = "that brown Fox Jumped Over the lazy dog";
		Pattern pattern = Pattern.compile("Fox | Over");
		Matcher matcher = pattern.matcher(sentence);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}

	}
}
