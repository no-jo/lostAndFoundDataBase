package com.capgemini.lostAndFoundDB.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rating {
	NOTRATED,
	VERYBAD,
	BAD,
	REGULAR,
	GOOD,
	VERYGOOD;	

	@JsonValue
	public int toValue() {
	    return ordinal();
	}
};