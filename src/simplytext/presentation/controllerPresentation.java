package simplytext.presentation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simplytext.inscriconnexion.controllerInscriConnexion;
import javafx.event.ActionEvent;


/**
 *
 * @author amal alsayed
 */
public class controllerPresentation {

    private Stage primaryStage;

    public void setStage(Stage s) {
        this.primaryStage = s;
    }
    
    @FXML
    public void test(ActionEvent action){
        
    }
    
    @FXML
    public void goToInscriConnexion(ActionEvent action) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/simplytext/inscriconnexion/viewInscriConnexion.fxml"));
        Parent root = loader.load();
        controllerInscriConnexion monController = (controllerInscriConnexion) loader.getController();
        monController.setStage(primaryStage);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/simplytext/style/style.css").toExternalForm()); //ligne ajoutée pour que j'ai bien mon css
        this.primaryStage.setScene(scene);
        this.primaryStage.show();
    }

}
