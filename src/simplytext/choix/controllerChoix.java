package simplytext.choix;



import javafx.event.ActionEvent;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simplytext.friseChrono.controllerFriseChrono;


public class controllerChoix {
    private Stage primaryStage;

    
    public void setStage(Stage s) {
	this.primaryStage = s;
    }
    
    public void processEnter(ActionEvent action) throws Exception {
	Parent root = FXMLLoader.load(getClass().getResource("/simplytext/friseChrono/viewFriseChrono.fxml"));
	Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/simplytext/style/style.css").toExternalForm()); //ligne ajoutée pour que j'ai bien mon css
	this.primaryStage.setScene(scene);
	this.primaryStage.show();
<<<<<<< HEAD
        
        controllerFriseChrono monControllerFrise = loader.getController();
        monControllerFrise.process();
        


=======
>>>>>>> 0560280dd54cab9dd257fded7648ab3c230f0450
    }
    
 
    
}