package com.virtusa.code.converterImpl;

import com.virtusa.code.constants.Constants;
import com.virtusa.code.converter.IConverter;

public class TensConverter extends AbstractConverter {

	public TensConverter(IConverter converter) {
		super(Constants.tensNames,converter);
	}
	public String convert(int number) {
		return data[number%10]; 
	}

}
