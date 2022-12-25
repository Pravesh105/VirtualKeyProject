package com.cisco.virtualkeyproject;

import com.cisco.virtualkeyproject.screens.WelcomeScreen;

public class VirtualKey {
	
    public static void main( String[] args ){
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();
    }
}
