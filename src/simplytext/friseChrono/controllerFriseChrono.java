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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
        
    @FXML
    Tooltip tooltip2;
    @FXML
    Label date2;  
    @FXML
    Tooltip tooltip3;
    @FXML
    Label date3;    
    @FXML
    Tooltip tooltip4;
    @FXML
    Label date4;    
    @FXML
    Tooltip tooltip5;
    @FXML
    Label date5;    
    @FXML
    Tooltip tooltip6;
    @FXML
    Label date6;    
    @FXML
    //TextArea textIn;
        
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
        tooltip1.setText("Le pacte de non-agression signé en 1939.");
        date1.setText("1939");
        tooltip2.setText("");
        date2.setText("1940");

        tooltip3.setText("En Europe, l'Allemagne envahit l'URSS le 22 juin 1941. En Asie, le Japon bombarde le port de Pearl Harbor aux États-Unis le 7 décembre 1941, provoquant l'entrée en guerre des États-Unis." );
        date3.setText("1941");


        tooltip4.setText("La fin de l'année 1942 peut être considérée comme le tournant de la guerre.");
        date4.setText("1942");

        
        tooltip5.setText("Staline donne l'ordre aux Russes de résister à tout prix. C'est cette démonstration qui va permettre à l'URSS de remporter la très symbolique victoire de Stalingrad en février 1943.");
        date5.setText("1943");

        tooltip6.setText("saluudddddddddddjjjjjjjjjjjjjjjjjjjddddddddddddddduut");
        date6.setText("1944");

    }


    
    
        
          
        

    
    
    
   
}

