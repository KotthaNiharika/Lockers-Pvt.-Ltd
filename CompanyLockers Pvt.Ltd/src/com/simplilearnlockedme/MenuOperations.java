package com.simplilearnlockedme;

public class MenuOperations {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("**************************************************\n"
				+ "Welcome to %s.com. \n" + "This application is developed by %s.\n"
				+ "**************************************************\n", appName, developerName);
		String appFunction = "You can use this application to perform the following operations :\n"
				+ "*Retrieve all file names in the \"main\" folder\n"
				+ "*Search, add, and delete files from \"main\" folder\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n** Select any option from below and press Enter **\n"
				+ "1. Retrieve the file names in Ascending Order\n" + "2. Business level operations\n"
				+ "3. Close the Application \n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n** Select one option and press Enter **\n"
				+ "1. Add a file to \"main\" folder\n" + "2. Delete a file from \"main\" folder\n"
				+ "3. Search a file from \"main\" folder\n" + "4. Show Previous Menu\n" + "5. Exit program\n";

		System.out.println(fileMenu);
	}

}