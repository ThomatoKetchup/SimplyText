/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplytext.inscriconnexion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simplytext.inscriconnexion.ControllerInscriconnexion;


public class MainInscriconnexion extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewInscriconnexion.fxml"));
        Parent root = (Parent)loader.load();
        //ControllerInscriconnexion monController = (ControllerInscriconnexion)loader.getController();
        //monController.setStage(primaryStage);
        Scene scene = new Scene(root);
        scene.getStylesheets().addAll(this.getClass().getResource("/simplytext/style/style.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

    