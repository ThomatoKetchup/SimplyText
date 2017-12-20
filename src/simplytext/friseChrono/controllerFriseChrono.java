// LoginControl.java
package simplytext.friseChrono;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.control.Tooltip;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import simplytext.choix.controllerChoix;

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
    Text titre;
    //TextArea textIn;
        
    //private Stage primaryStage;

    //@FXML
   // private Stage primaryStage;
    
    
    
    //@FXML
    public void process(ActionEvent event) {
        
        titre.setText("La seconde guerre mondiale");
        tooltip1.setText("1939 : Le pacte de non-agression signé.");
        date1.setText("1939");
        tooltip2.setText("");
        date2.setText("1940");

        tooltip3.setText("22 juin 1941, Europe : l'Allemagne envahit l'URSS1 en rompant le pacte de non-agression.\n"
                + "\n7 décemble 1941, Asie : le Japon bombarde le port de Pearl Harbor provoquant l'entrée en guerre des États-Unis. \n " );
        date3.setText("1941");


        tooltip4.setText("Juin 1942, Pacifique : victoire de Midway des américains face aux japonais.");
        date4.setText("1942");

        
        tooltip5.setText("Février 1943, Stalingrand : victoire de Stalingrad \n"
                + "\nFévrier 1943, Pacifique : victoire de Guadalcanal des américains face aux japonais. ");
        date5.setText("1943");

        tooltip6.setText("");
        date6.setText("1944");
    }
    
    
    private Stage primaryStage;

    
    public void setStage(Stage s) {
	this.primaryStage = s;
    }

    public void returnToChoix(ActionEvent action) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/simplytext/choix/viewChoix.fxml"));
	Parent root = loader.load();
        controllerChoix monController = (controllerChoix)loader.getController();
        monController.setStage(primaryStage);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/simplytext/style/style.css").toExternalForm()); //ligne ajoutée pour que j'ai bien mon css
	this.primaryStage.setScene(scene);
	this.primaryStage.show();


    }


    
    
        
          
        

    
    
    
   
}

