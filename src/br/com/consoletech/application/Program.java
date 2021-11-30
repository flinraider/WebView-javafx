package br.com.consoletech.application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Program extends Application {
		
	private static Scene mainScene;
	
	@FXML
	private static WebView webView;
	
	@FXML
	private static WebEngine engine;
	
	@FXML
	private VBox vbox;
	
	@FXML
	private ToolBar tooBar;	
	
	@FXML
	private Button btn;
	
	@FXML
	private TextField txtSearch;
	
	String url = "https://youtube.com";
	
	@FXML
	private Label label;
	
	@Override
	public void start(Stage stage) {
		
		try {
			String pagePath = "/br/com/consoletech/application/PageView.fxml";
			FXMLLoader loader = new FXMLLoader(getClass().getResource(pagePath));
			VBox vbox = loader.load(); 
			webView = new WebView();
			engine = webView.getEngine();
			engine.load(url);
			vbox.getChildren().add(webView);
			webView.prefHeightProperty().bind(stage.heightProperty());
			mainScene = new Scene(vbox, 900, 600);
			stage.setScene(mainScene);
			stage.setTitle("ConsoleWeb");
			stage.show();
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}
	
	public void loadNewPage() {
		engine.load("https://"+txtSearch.getText());
		txtSearch.setText("");
		urlUpdate();
	}
	
	public void urlUpdate() {
		label.setText(engine.getLocation());
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
