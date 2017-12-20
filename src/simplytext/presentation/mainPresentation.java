
package simplytext.presentation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;


    
public class mainPresentation extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/simplytext/presentation/viewPresentation.fxml"));      
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root);
        controllerPresentation monController = (controllerPresentation)loader.getController();
        monController.setStage(primaryStage);
        scene.getStylesheets().addAll(this.getClass().getResource("/simplytext/style/style.css").toExternalForm());
        primaryStage.setScene(scene); 
        primaryStage.show();  

}
    public static void main(String[] args) {
        launch(args); 
    }
}
