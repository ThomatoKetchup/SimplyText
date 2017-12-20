package simplytext.inscriconnexion;



import javafx.event.ActionEvent;


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
    
    /*public void processEnter(ActionEvent action) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/simplytext/choix/viewChoix.fxml"));
	Parent root = loader.load();
	Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/simplytext/style/style.css").toExternalForm()); //ligne ajoutée pour que j'ai bien mon css
	this.primaryStage.setScene(scene);
	this.primaryStage.show();
        
        controllerChoix monControllerchoix = loader.getController();
        monControllerchoix.process(action);
        


    }*/
    
 
    
}
