
package simplytext.presentation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import simplytext.DossierExistants.App;
import simplytext.DossierExistants.MainTest;


    
public class mainPresentation extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/simplytext/presentation/viewPresentation.fxml"));      
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        controllerPresentation monController = (controllerPresentation)loader.getController();
        monController.setStage(primaryStage);
        scene.getStylesheets().addAll(this.getClass().getResource("/simplytext/style/style.css").toExternalForm());
        primaryStage.setScene(scene); 
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
                new mainPresentation().start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(mainPresentation.class.getName()).log(Level.SEVERE, null, ex);
            }
				
				
        }); 
    }
}
