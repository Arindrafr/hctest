package com.hctest.model.enumdto;

public enum ResponseCode {
	SUCCESS(200),
	SOMETHINGWRONG(680)
	;


    private final int value;
    
    private ResponseCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
	

}
