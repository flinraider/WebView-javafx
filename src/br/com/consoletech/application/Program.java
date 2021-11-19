package br.com.consoletech.application;

import javafx.application.Application;
import javafx.stage.Stage;

public class Program extends Application {
	
	Page pg = new Page();
	
	@Override
	public void start(Stage stage) throws Exception {
		Page.primaryPage(stage);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
