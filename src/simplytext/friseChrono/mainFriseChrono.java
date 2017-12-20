package simplytext.friseChrono;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.text.Font;
import javafx.stage.Stage;        
        


public class mainFriseChrono extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("viewFriseChrono.fxml")); //appel le fichier fxml(il y a les tailles des boutons posetc
        Scene scene = new Scene(root); 
        
        scene.getStylesheets().addAll(this.getClass().getResource("/simplytext/style/style.css").toExternalForm());
        primaryStage.setScene(scene); //prépare la scène
        primaryStage.show();  //affiche la scène
        
        
    }

    public static void main(String[] args) {
        
        launch(args); //lancer jave FX et appel start
    }
}
