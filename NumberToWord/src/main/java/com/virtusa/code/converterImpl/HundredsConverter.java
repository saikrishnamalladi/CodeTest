package com.virtusa.code.converterImpl;

import com.virtusa.code.constants.Constants;
import com.virtusa.code.converter.IConverter;

public class HundredsConverter extends AbstractConverter {

	public HundredsConverter(IConverter converter) {
		super(Constants.numNames,converter);
	}
	public String convert(int number) {
		String current;
        
        if (number % 100 < 20){
            current = data[number % 100];
            number /= 100;
        }
        else {
            current = data[number % 10];
            number /= 10;
            current = converter.convert(number) + current;
            number /= 10;
        }
        if (number == 0) return current;
        return data[number] + Constants.SPACE + Constants.hundred + current;
	}

}
