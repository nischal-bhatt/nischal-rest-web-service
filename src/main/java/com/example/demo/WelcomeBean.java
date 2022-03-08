package com.example.demo;

public class WelcomeBean {
 private String message;
 private String anothermessage = "123";

public String getAnothermessage() {
	return anothermessage;
}

public void setAnothermessage(String anothermessage) {
	this.anothermessage = anothermessage;
}

public WelcomeBean(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
 
 
}
