
package simplytext.presentation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
        
/**
 *
 * @author amal alsayed
 */
public class mainPresentation extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Font.loadFont(getClass().getResourceAsStream("/simplytext/style/Blueshire-Regular.ttf"), 14);
        
        Parent root = FXMLLoader.load(getClass().getResource("viewPresentation.fxml")); 
        Scene scene = new Scene(root);
        scene.getStylesheets().addAll(this.getClass().getResource("/simplytext/style/style.css").toExternalForm());
        primaryStage.setScene(scene); 
        primaryStage.show();  
    
    
}
    public static void main(String[] args) {
        launch(args); 
    }
}
