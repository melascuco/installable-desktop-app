package com.melascuco.installabledesktopapp;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstallableDesktopAppApplication {

	public static void main(String[] args) {
		Application.launch(JavafxApplication.class, args);
	}

}
