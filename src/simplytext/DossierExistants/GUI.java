package simplytext.DossierExistants;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI {
	
    private TableView<PersonEntry> table = new TableView<PersonEntry>();
    private final ObservableList<PersonEntry> data =
        FXCollections.observableArrayList(
            new PersonEntry("25/10/2015", "La Seconde Guerre Mondiale", "Frise Chronologique"),
            new PersonEntry("23/10/2015", "SVT_Les roches", "Fiche de cours"),
            new PersonEntry("30/11/2015", "La Chine", "Carte geographique")
        );
    
    final HBox hb = new HBox();
    
    public void initialize(Stage stage) {
		
    	
        Scene scene = new Scene(new Group());
        stage.setTitle("Carnet d'adresses");
        stage.setWidth(800);
        stage.setHeight(500);
 
        table.setEditable(true);
 
        TableColumn firstNameCol = new TableColumn("Date");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<PersonEntry, String>("firstName"));
 
        TableColumn lastNameCol = new TableColumn("Nom");
        lastNameCol.setMinWidth(300);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<PersonEntry, String>("lastName"));
 
        TableColumn emailCol = new TableColumn("Domaine");
        emailCol.setMinWidth(300);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<PersonEntry, String>("email"));
        
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
         
        final VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
        
        
    }
 
} 