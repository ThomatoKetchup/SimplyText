package simplytext.inscriconnexion;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simplytext.choix.controllerChoix;


public class controllerInscriConnexion {
    private Stage primaryStage;

    
    public void setStage(Stage s) {
	this.primaryStage = s;
    }
    
        @FXML
    public void goToChoix(ActionEvent action) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/simplytext/choix/viewChoix.fxml"));
        Parent root = loader.load();
        controllerChoix monController = (controllerChoix) loader.getController();
        monController.setStage(primaryStage);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/simplytext/style/style.css").toExternalForm()); //ligne ajoutée pour que j'ai bien mon css
        this.primaryStage.setScene(scene);
        this.primaryStage.show();
    }
    
 
    
}
