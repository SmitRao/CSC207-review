package gui;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.*;

public class GoodLuckGUI extends Application implements EventHandler<ActionEvent> {
	
	@Override
	public void start(Stage stage) {
		HBox root = new HBox();
		root.setPadding(new Insets(5));
		Scene sc = new Scene(root);
		stage.setTitle("Good luck");
		stage.setScene(sc);
		stage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
