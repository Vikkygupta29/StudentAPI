package com.springbootrestapi.usermodel;

import java.util.UUID;

public  class UniqueCodegenerator {
	
	 public static String generateCode(String prefix) {
	        return prefix + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
	    }
}
