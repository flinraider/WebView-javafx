package br.com.consoletech.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Program extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		FlowPane view = new FlowPane();
		WebView wv = new WebView();
		WebEngine engine = wv.getEngine();
		engine.load("https://consoletech.com.br");
		stage.setTitle("WEB");
		view.getChildren().add(wv);
		stage.setScene(new Scene(view));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
