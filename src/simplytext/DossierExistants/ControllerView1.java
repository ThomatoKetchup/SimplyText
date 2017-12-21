package simplytext.DossierExistants;


import javafx.fxml.FXML;

public class ControllerView1 {
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
		App.launch(null);
	}

}
