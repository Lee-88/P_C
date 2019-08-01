package soft;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class window_class extends Application {
	@Override
	public void start(Stage S)  {
		StackPane layout = new StackPane();
		S.setTitle("Package Class");
		S.setScene(new Scene(layout,300,250));
		S.show();
	}
	
    public static void main(String[] args) {
    	System.out.println("Run.Time.Info:main(args).excounter.");
    	launch(args);
    }
}
