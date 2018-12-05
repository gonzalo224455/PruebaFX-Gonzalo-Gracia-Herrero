package application.control;
	
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
/**
 * 
 * @author Gonzalo
 *
 */

public class Main extends Application {
	/**
	 * Se crea una atributo de imagen
	 */
	@FXML
	private ImageView img;
	@Override
	/**
	 * @param: primaryStage estancia la stage principal
	 * Inicia la escena y se añade la font
	 */
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/Profile.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Poiret+One");
			primaryStage.setTitle("Examen");
			
			primaryStage.setScene(scene);
			primaryStage.show();
			img();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * Este metodo es una transicion
	 */
	@FXML
	private void img() {
		
		FadeTransition fadeTransition1 = new FadeTransition(
				Duration.seconds(2), img);
		fadeTransition1.setFromValue(0);
		fadeTransition1.setToValue(1);
		fadeTransition1.play();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
