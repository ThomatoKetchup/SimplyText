package simplytext.presentation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import simplytext.DossierExistants.ControllerView1;
import simplytext.inscriconnexion.controllerInscriConnexion;
  

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
    
        public void goToDossierExistants(ActionEvent action) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/simplytext/DossierExistants/view1.fxml"));
        Parent root = loader.load();
        ControllerView1 monController = (ControllerView1) loader.getController();
        monController.setStage(primaryStage);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/simplytext/style/style.css").toExternalForm()); //ligne ajoutée pour que j'ai bien mon css
        this.primaryStage.setScene(scene);
        this.primaryStage.show();
    }
    
    

}
