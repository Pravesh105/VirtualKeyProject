package com.cisco.virtualkeyproject.services;

import com.cisco.virtualkeyproject.screens.FileOptionsScreen;
import com.cisco.virtualkeyproject.screens.Screen;
import com.cisco.virtualkeyproject.screens.WelcomeScreen;

public class ScreenService {

		public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
	    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
	    
	    

	    public static Screen CurrentScreen = WelcomeScreen;

	    
	    public static Screen getCurrentScreen() {
	        return CurrentScreen;
	    }

	    
	    public static void setCurrentScreen(Screen currentScreen) {
	        CurrentScreen = currentScreen;
	    }
}
