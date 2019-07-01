package com.virtusa.code.converterImpl;

import com.virtusa.code.converter.IConverter;

public abstract class AbstractConverter implements IConverter {
	
	protected String[] data;
	protected IConverter converter;
	
	AbstractConverter(String[] data,IConverter converter) {
		this.data = data;
		this.converter = converter;
	}
	

}
