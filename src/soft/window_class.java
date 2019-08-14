package soft;
import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
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
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Scale;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
@SuppressWarnings("unused")
//Application Window
public class window_class extends Application {
//objects
	//int[][] toolbox = {0,0}{0,0};
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");
	Button btn9 = new Button("9");
	Button btn10 = new Button("A");
	Button btn11 = new Button("B");
	Button btn12 = new Button("C");
	Button btn13 = new Button("D");
	Circle cir = new Circle();
	ColorPicker cp = new ColorPicker();
	ColorPicker cp2 = new ColorPicker();
	Label l2 = new Label("Circle ++");
	
	static Pane layout = new Pane();
	@Override
	public void start(Stage S) {
//Window
		S.setTitle("Fetch-Circle");
		S.setScene(new Scene(layout,1920,1080));
		S.setMaximized(true);
//object specifications
			btn1.setPrefSize(25, 25);
			btn2.setPrefSize(25, 25);
			btn3.setPrefSize(25, 25);
			btn4.setPrefSize(25, 25);
			btn5.setPrefSize(25, 25);
			btn6.setPrefSize(25, 25);
			btn7.setPrefSize(25, 25);
			btn8.setPrefSize(25, 25);
			btn9.setPrefSize(25, 25);
			btn10.setPrefSize(25, 25);
			btn11.setPrefSize(25, 25);
			btn12.setPrefSize(25, 25);
			btn13.setPrefSize(25, 25);
			cp.setPrefSize(150, 25);
			cp.setValue(Color.valueOf("#00ca03"));
			cp2.setPrefSize(150, 25);
			cp2.setValue(Color.valueOf("#000000"));
//Layout X			
			btn1.setLayoutX(0.0);
			btn2.setLayoutX(0.0);
			btn3.setLayoutX(0.0);
			btn4.setLayoutX(0.0);
			btn5.setLayoutX(0.0);
			btn6.setLayoutX(0.0);
			btn7.setLayoutX(0.0);
			btn8.setLayoutX(0.0);
			btn9.setLayoutX(0.0);
			btn10.setLayoutX(0.0);
			btn11.setLayoutX(0.0);
			btn12.setLayoutX(0.0);
			btn13.setLayoutX(0.0);
			cp.setLayoutX(25.0);
			cp2.setLayoutX(175.0);
			l2.setLayoutX(25.0);
			//Layout Y			
			btn1.setLayoutY(0.0);
			btn2.setLayoutY(25.0);
			btn3.setLayoutY(50.0);
			btn4.setLayoutY(75.0);
			btn5.setLayoutY(100.0);
			btn6.setLayoutY(125.0);
			btn7.setLayoutY(150.0);
			btn8.setLayoutY(175.0);
			btn9.setLayoutY(200.0);
			btn10.setLayoutY(225.0);
			btn11.setLayoutY(250.0);
			btn12.setLayoutY(275.0);
			btn13.setLayoutY(300.0);
			cp.setLayoutY(0.0);
			cp2.setLayoutY(0.0);
			l2.setLayoutY(25.0);
			layout.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,l2,cp2,cp);
//Actions
			btn1.setOnAction(e -> btn1func());
			btn2.setOnAction(e -> btn2func());
			btn3.setOnAction(e -> btn3func());
			btn4.setOnAction(e -> btn4func());
			btn5.setOnAction(e -> btn5func());
			btn6.setOnAction(e -> btn6func());
			btn7.setOnAction(e -> btn7func());
			btn8.setOnAction(e -> btn8func());
			btn9.setOnAction(e -> btn9func());
			btn10.setOnAction(e -> btn10func());
			btn11.setOnAction(e -> btn11func());
			btn12.setOnAction(e -> btn12func());
			btn13.setOnAction(e -> btn13func());
			layout.setOnMouseClicked(e -> {if (e.getButton() == MouseButton.PRIMARY) { 
				soft.circle_class.createnew(cp.getValue(), e.getX() , e.getY());
			}});
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
					Color Contain = cp.getValue();
					int x=(int) (Math.random()*(((layout.getWidth())-0)+1)+0);//make random x location
					int y=(int) (Math.random()*(((layout.getHeight())-175)+1)+175);//make random y location
					soft.circle_class.createnew(Contain, x, y);
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
				private Object btn5func() {
					// TODO Auto-generated method stub
					return null;
				}
				private Object btn6func() {
					// TODO Auto-generated method stub
					return null;
				}
				private Object btn7func() {
					// TODO Auto-generated method stub
					return null;
				}
				private Object btn8func() {
					// TODO Auto-generated method stub
					return null;
				}
				private Object btn9func() {
					// TODO Auto-generated method stub
					return null;
				}
				private Object btn10func() {
					// TODO Auto-generated method stub
					return null;
				}
				private Object btn11func() {
					// TODO Auto-generated method stub
					return null;
				}
				private Object btn12func() {
					// TODO Auto-generated method stub
					return null;
				}
				private Object btn13func() {
					// TODO Auto-generated method stub
					return null;
				}
//---------------------------------------------------------------------------
//public main
	public static void main(String[] args) {
    	System.out.println("Run.Time.Info:main(args).excounter.");
    	launch(args);
    }
}
