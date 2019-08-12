package soft;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Scale;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
@SuppressWarnings("unused")
//Application Window
public class window_class extends Application {
//objects	
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btn4 = new Button("4");
	Circle cir = new Circle();
	ColorPicker cp = new ColorPicker(); //The Button btn1 action sets the Colour of 'Circle cir'.
	Label l2 = new Label("This is Button 2");
	Label l3 = new Label("This is Button 3");
	Label l4 = new Label("This is Button 4");
	
	
	@Override
	public void start(Stage S) {
//Window
		Pane layout = new Pane();
		S.setTitle("Package Class");
		S.setScene(new Scene(layout,283,468));
//object specifications
			btn1.setPrefSize(25, 25);
			btn2.setPrefSize(25, 25);
			btn3.setPrefSize(25, 25);
			btn4.setPrefSize(25, 25);
			cp.setPrefSize(150, 25);
			cir.setRadius(50);
//Layout X			
			btn1.setLayoutX(0.0);
			btn2.setLayoutX(0.0);
			btn3.setLayoutX(0.0);
			btn4.setLayoutX(0.0);
			cp.setLayoutX(25.0);
			l2.setLayoutX(25.0);
			l3.setLayoutX(25.0);
			l4.setLayoutX(25.0);
			//Layout Y			
			btn1.setLayoutY(0.0);
			btn2.setLayoutY(25.0);
			btn3.setLayoutY(50.0);
			btn4.setLayoutY(75.0);
			cp.setLayoutY(0.0);
			l2.setLayoutY(25.0);
			l3.setLayoutY(50.0);
			l4.setLayoutY(75.0);
			layout.getChildren().addAll(cir,btn1,btn2,btn3,btn4,l2,l3,l4,cp);
			cir.setLayoutX(layout.getWidth()/2);
			cir.setLayoutY(layout.getHeight()/2);
//Actions
			btn1.setOnAction(e -> btn1func());
			btn2.setOnAction(e -> btn2func());
			btn3.setOnAction(e -> btn3func());
			btn4.setOnAction(e -> btn4func());
			S.show();
	}
//---------------------------------------------------------------------------
	//Button Functions
				private Object btn1func() {
					System.out.println("Run.Time.Info:btn1func(args).excounter.");
					cir.setFill(cp.getValue());
					return null;
				}
				private Object btn2func() {
					System.out.println("Run.Time.Info:btn2func(args).excounter.");
					return null;
				}
				private Object btn3func() {
					System.out.println("Run.Time.Info:btn3func(args).excounter.");
					return null;
				}
				private Object btn4func() {
					System.out.println("Run.Time.Info:btn4func(args).excounter.");
					return null;
				}
//---------------------------------------------------------------------------
//public main
	public static void main(String[] args) {
    	System.out.println("Run.Time.Info:main(args).excounter.");
    	launch(args);
    }
}
