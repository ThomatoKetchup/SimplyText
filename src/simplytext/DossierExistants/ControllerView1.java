package simplytext.DossierExistants;


import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ControllerView1 {
    
        private Stage primaryStage;

    public void setStage(Stage s) {
        this.primaryStage = s;
    }

	@FXML
	private void AffichageFiches () {
		new Thread() {
            @Override
            public void run() {
                javafx.application.Application.launch(App.class);
            }
        }.start();

        App startUpTest = App.waitForApp();
        startUpTest.printSomething();
		System.out.println("I am being called");
		App.launch();
	}

}
