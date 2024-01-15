package examples11javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LabelExample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		
		Label l1 = new Label("Label 1");
		Label l2 = new Label("Here is a Label with\n some text");
		l2.setFont(Font.font("Default", FontWeight.BOLD, 16));

		Image image = new 	Image(getClass().getResourceAsStream("tools.png"), 20, 20, true, true);
		Label l3 = new Label("A Label with an image");
		l3.setGraphic(new ImageView(image));
		l3.setContentDisplay(ContentDisplay.RIGHT);
		
		root.getChildren().addAll(l1, l2, l3);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}