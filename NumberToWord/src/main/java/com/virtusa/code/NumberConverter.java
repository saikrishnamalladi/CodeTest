package com.virtusa.code;

import com.virtusa.code.converter.IConverter;
import com.virtusa.code.converterImpl.HundredsConverter;
import com.virtusa.code.converterImpl.TensConverter;
import com.virtusa.code.converterImpl.ThousandsConverter;

public class NumberConverter {
	
	private static IConverter converter;
	
	static {
		IConverter tensConverter = new TensConverter(null);
		IConverter hundConverter = new HundredsConverter(tensConverter);
		converter = new ThousandsConverter(hundConverter);
	}
	
	public static String convertToWord(int number) {
		return converter.convert(number);
	}

}
