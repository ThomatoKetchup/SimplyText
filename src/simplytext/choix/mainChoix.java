package simplytext.choix;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simplytext.friseChrono.controllerFriseChrono;


public class mainChoix extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/simplytext/choix/viewChoix.fxml"));      
        Parent root = (Parent)loader.load();
        controllerChoix monController = (controllerChoix)loader.getController();
        monController.setStage(primaryStage);
        Scene scene = new Scene(root);
        scene.getStylesheets().addAll(this.getClass().getResource("/simplytext/style/style.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.show();
        
        

    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}