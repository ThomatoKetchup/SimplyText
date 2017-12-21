package simplytext.DossierExistants;

import simplytext.DossierExistants.GUI;
import java.util.concurrent.CountDownLatch;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		///GuiApp1 gui = new GuiApp1();
		GUI gui = new GUI();
		//GUI2 gui = new GUI2();
		gui.initialize(primaryStage);
		
	}
	
	
	public static final CountDownLatch latch = new CountDownLatch(1);
    public static App App = null;

    public static App waitForApp() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return App;
    }

    public static void setApp(App App0) {
        App = App0;
        latch.countDown();
    }

    public App() {
        setApp(this);
    }

    public void printSomething() {
        System.out.println("You called a method on the application");
    }
}
