package examples11javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox box = new HBox();
		box.getChildren().add(new Button("Item 1"));
		box.getChildren().add(new Button("Item 2"));
		box.getChildren().add(new Button("Item 3"));
		box.getChildren().add(new Button("Item 4"));
		box.getChildren().add(new Button("Item 5"));
		
		Scene scene = new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}