package br.com.consoletech.application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Page {
	

	
	@FXML
	public static void primaryPage(Stage stage) {
		FlowPane view = new FlowPane();
		WebView wv = new WebView();
		WebEngine engine = wv.getEngine();
		engine.load("https://youtube.com");
		stage.setTitle("WEB");
		view.getChildren().add(wv);
		stage.setScene(new Scene(view	));
		stage.show();
	}

}
