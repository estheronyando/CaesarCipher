package org.example;

public class Caesar {
    private String message;
    private int shiftKey;

    public Caesar(String message, int shiftKey) {
        this.message = message.toLowerCase();
        this.shiftKey = shiftKey;
    }
    public String getMessage(){
        return message;
    }
    public int getShiftKey(){
        return shiftKey;
    }

}
