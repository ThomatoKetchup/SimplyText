// LoginControl.java
package simplytext.friseChrono;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class controllerFriseChrono {
    
    @FXML
    ImageView image;
    SplitPane splitpane;
    
    @FXML
    Tooltip tooltip1;
    @FXML
    Label date1;
    
    private Stage primaryStage;
    
    public void setStage(Stage s) {
	this.primaryStage = s;
    }
    
    public void processEnter(ActionEvent action) throws Exception {
	Parent root = FXMLLoader.load(getClass().getResource("viewFriseChrono.fxml"));
	Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/simplytext/style/style.css").toExternalForm()); //ligne ajoutée pour que j'ai bien mon css
	this.primaryStage.setScene(scene);
	this.primaryStage.show();

    }
    
    

    @FXML
	private void process(ActionEvent event) {
            tooltip1.setText("saluudddddddddddddddddddddddddduut");
            date1.setText("1923");
	}
    

    
    
        
          
        

    
    
    
   
}

