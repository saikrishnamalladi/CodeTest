package com.virtusa.code.converterImpl;

import com.virtusa.code.constants.Constants;
import com.virtusa.code.converter.IConverter;

public class ThousandsConverter extends AbstractConverter {

	public ThousandsConverter(IConverter converter) {
		super(Constants.specialNames,converter);
	}

	public String convert(int number) {
		String word="";
		if (number == 0) {
			return "zero";
		}

		String prefix = "";

		if (number < 0) {
			number = -number;
			prefix = "negative";
		}

		String current = "";
		int place = 0;

		do {
			int n = number % 1000;
			if (n != 0) {
				String s = converter.convert(n);
				current = s + data[place] + (number > 0 ? Constants.SPACE + Constants.and : "") + current;
			}
			place++;
			number /= 1000;
		} while (number > 0);
		word = (prefix + current).trim();
		word = word.substring(0, word.length()-4);
		return word;
	}

}
