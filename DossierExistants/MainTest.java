package simplytext.DossierExistants;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MainTest extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
			
	        Parent root = FXMLLoader.load(getClass().getResource("view1.fxml"));
			Scene scene = new Scene(root);

			primaryStage.setScene(scene);
			scene.getStylesheets().add(getClass().getResource("/simplytext/style/style.css").toExternalForm());
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		System.out.println("Starting first app");
        Platform.runLater(() -> {
           
				try {
					new App().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        });
        System.out.println("Starting second app");
        Platform.runLater(() -> {
            
				try {
					new MainTest().start(new Stage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        });
	}
}
