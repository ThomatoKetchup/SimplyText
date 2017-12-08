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
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

public class controllerFriseChrono {

    @FXML
    ImageView image;
    SplitPane splitpane;
    
    @FXML
    Tooltip tooltip1;
    

    
    @FXML
	private void process(ActionEvent event) {  //lorsqu'on appuie sur le bouton Action Event event prend le chiffre
		tooltip1.setText("saluuuut");
	}
    
        

    
    
    
   
}

