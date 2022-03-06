package com.simplilearnlockedme;



public class MainModule {

	public static void main(String[] args) {
		
			
			// Create "main" folder if not present in current folder structure
		FileOptions.createMainFolderIfNotPresent("main");
			
		MenuOperations.printWelcomeScreen("LockedMe", "NIHARIKA KOTTHA");
			
		HandlingOptions.handleWelcomeScreenInput();
		}	
	}
