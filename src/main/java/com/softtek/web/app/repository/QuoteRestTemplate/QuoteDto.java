package com.softtek.web.app.repository.QuoteRestTemplate;

public class QuoteDto {
	
	private String type;
	private ValueDto value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ValueDto getValue() {
		return value;
	}

	public void setValue(ValueDto value) {
		this.value = value;
	}

}
