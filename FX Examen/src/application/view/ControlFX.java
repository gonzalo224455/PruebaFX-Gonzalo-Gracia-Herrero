package application.view;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
/**
 * 
 * @author Gonzalo
 *
 */
public class ControlFX {
	/**
	 * Se crea un atributo del stage para un metodo
	 */
	private Stage stage;
	/**
	 * Este metodo cierra las ventanas
	 */
	@FXML
	private void Close() {
	
	        System.exit(0);
	}
	/**
	 * En este metodo se abre una nueva ventana
	 */
	
	@FXML
	private void nuevapantalla() {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("GetMe.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            Scene scene = new Scene(page);
            sendStage.setScene(scene);         
            sendStage.initStyle(StageStyle.UNDECORATED);
            sendStage.setScene(scene);
            sendStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
	
}
