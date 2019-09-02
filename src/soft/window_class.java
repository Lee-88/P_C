package soft;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
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
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
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
//ToolBox Array
	static boolean pressed = false;
	static float mysize = 0.f;
	static float myspeed = 0.f;
	static int[] toolbox = new int[14];
	static Slider slider = new Slider(0, 50, 10);
	static Slider slider2 = new Slider(0, 10, 0);
 	Button btn1 = new Button();
	Button btn2 = new Button();
	Button btn3 = new Button();
	Button btn4 = new Button();
	Button btn5 = new Button();
	Button btn6 = new Button();
	Button btn7 = new Button();
	Button btn8 = new Button();
	Button btn9 = new Button();
	Button btn10 = new Button();
	Button btn11 = new Button();
	Button btn12 = new Button();
	Button btn13 = new Button();
	
	static ColorPicker cp = new ColorPicker();
	ColorPicker cp2 = new ColorPicker();
	static Pane layout = new Pane();
	
	@Override
	public void start(Stage S) throws FileNotFoundException {
		layout.getStylesheets().add("/Stylesheet.css");
//Toolbox initialiser Check
		changetool(0);
//Window
		S.setTitle("Fetch-Circle");
		S.setScene(new Scene(layout,740,580));
		S.setMaximized(true);
//Button Images
			Image image1 = new Image(getClass().getResourceAsStream("icons/btn1.jpg"));btn1.setGraphic(new ImageView(image1));
		 	Image image2 = new Image(getClass().getResourceAsStream("icons/btn2.jpg"));btn2.setGraphic(new ImageView(image2));
		 	Image image3 = new Image(getClass().getResourceAsStream("icons/btn3.jpg"));btn3.setGraphic(new ImageView(image3));
		 	Image image4 = new Image(getClass().getResourceAsStream("icons/btn4.jpg"));btn4.setGraphic(new ImageView(image4));
		 	Image image5 = new Image(getClass().getResourceAsStream("icons/btn5.jpg"));btn5.setGraphic(new ImageView(image5));
		 	Image image6 = new Image(getClass().getResourceAsStream("icons/btn6.jpg"));btn6.setGraphic(new ImageView(image6));
		 	Image image7 = new Image(getClass().getResourceAsStream("icons/btn7.jpg"));btn7.setGraphic(new ImageView(image7));
		 	Image image8 = new Image(getClass().getResourceAsStream("icons/btn8.jpg"));btn8.setGraphic(new ImageView(image8));
		 	Image image9 = new Image(getClass().getResourceAsStream("icons/btn9.jpg"));btn9.setGraphic(new ImageView(image9));
		 	Image image10 = new Image(getClass().getResourceAsStream("icons/btn10.jpg"));btn10.setGraphic(new ImageView(image10));
		 	Image image11 = new Image(getClass().getResourceAsStream("icons/btn11.jpg"));btn11.setGraphic(new ImageView(image11));
		 	Image image12 = new Image(getClass().getResourceAsStream("icons/btn12.jpg"));btn12.setGraphic(new ImageView(image12));
		 	Image image13 = new Image(getClass().getResourceAsStream("icons/btn13.jpg"));btn13.setGraphic(new ImageView(image13));
//Object Sizes		 	
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
//top Menu
			cp.setPrefSize(150, 25);
			cp.setValue(Color.valueOf("#00ca03"));
			cp2.setPrefSize(150, 25);
			cp2.setValue(Color.valueOf("#000000"));
			slider.setShowTickMarks(true);
			slider.setShowTickLabels(true);
			slider.setMajorTickUnit(0.25f);
		 	slider.setBlockIncrement(0.1f);
		 	slider2.setShowTickMarks(true);
			slider2.setShowTickLabels(true);
			slider2.setMajorTickUnit(0.25f);
		 	slider2.setBlockIncrement(0.1f);
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
			cp.setLayoutX(30.0);
			cp2.setLayoutX(180.0);
			slider.setLayoutX(330.0);
			slider2.setLayoutX(470.0);
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
//Children
			layout.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,cp2,cp,slider,slider2);
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
			
			//softcircle needs nesting inside a check tool function.
			layout.setOnMouseClicked(e -> {if (e.getButton() == MouseButton.PRIMARY) { 
			try {
				CheckTool(e);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			}} //This finds correct event for current tool selection from array comparison.
			); 
			
			S.show();
	}
//Check Too For Use
static void CheckTool(MouseEvent e) throws InterruptedException {
	System.out.println("Run.Time.Info:CheckTool().excounter.");
	mysize = (float) (slider.getValue())*5;
	myspeed = (float) (slider2.getValue());
	//Btn 0
	if(toolbox[0] == 0) {
	}
	//Btn1 Brush
	if(toolbox[1] == 1) {
		MyThread mythread = new MyThread();
		mythread.run();
		soft.brush_class.draw(cp.getValue(), e.getX() , e.getY());}
	//Btn2 Erase
	if(toolbox[2] == 2) {
		}
	//Btn3 Circle
	if(toolbox[3] == 3) {
		 soft.circle_class.createnew(cp.getValue(), e.getX() , e.getY());}
	//Btn4 Square
	if(toolbox[4] == 4) {
		soft.square_class.createnew(cp.getValue(), e.getX() , e.getY());}
	
	//Btn5 Line
	if(toolbox[5] == 5) {
		soft.line_class.createnew(cp.getValue(), e.getX() , e.getY());}
	
	
	//Btn6 Plus
	if(toolbox[6] == 6) {
	}
	
	//Btn7 Minus
	if(toolbox[7] == 7) {
	}
	
	//Btn8 Move
	if(toolbox[8] == 8) {
	}
	
	//Btn9 Trash All
	if(toolbox[9] == 9) {
	}
	
	//Btn10 Help
	if(toolbox[10] == 10) {
	}
	
	//Btn11 Options
	if(toolbox[11] == 11) {
	}
	
	//Btn12	information 
	if(toolbox[12] == 12) {
	}
	
	//Btn13 Text Create   
	if(toolbox[13] == 13) {
	}
	
	}
//Toolbox Change Tool, input tool number to have tool selected.
				private void changetool(int tb) {
					 System.out.println("[System Readout- Array Reset]");
					for (int i = 0; i < 14; i++) {
			        	 toolbox[i]= 0;
			        	 System.out.print(toolbox[i]+",");
					}	
					toolbox[tb]=tb;
					System.out.print("\nThe Array Now Reads: ");
					for (int i = 0; i < 14; i++) {
			        	 System.out.print(toolbox[i]+",");
			        	 }
					System.out.print("\n----------------\n");
			    }
				//---------------------------------------------------------------------------
//Button Functions
				private Object btn1func() {
					System.out.println("Run.Time.Info:btn1func(args).excounter.");
					changetool(1);
					return null;
				}
				private Object btn2func() {
					System.out.println("Run.Time.Info:btn2func(args).excounter.");
					changetool(2);
					return null;
				}
				private Object btn3func() {
					System.out.println("Run.Time.Info:btn3func(args).excounter.");
					changetool(3);
					return null;
				}
				private Object btn4func() {
					System.out.println("Run.Time.Info:btn4func(args).excounter.");
					changetool(4);
					return null;
				}
				private Object btn5func() {
					System.out.println("Run.Time.Info:btn5func(args).excounter.");
					changetool(5);
					return null;

				}
				private Object btn6func() {
					System.out.println("Run.Time.Info:btn6func(args).excounter.");
					changetool(6);
					return null;

				}
				private Object btn7func() {
					System.out.println("Run.Time.Info:btn7func(args).excounter.");
					changetool(7);
					return null;

				}
				private Object btn8func() {
					System.out.println("Run.Time.Info:btn8func(args).excounter.");
					changetool(8);
					return null;

				}
				private Object btn9func() {
					System.out.println("Run.Time.Info:btn9func(args).excounter.");
					changetool(9);
					return null;

				}
				private Object btn10func() {
					System.out.println("Run.Time.Info:btn10func(args).excounter.");
					changetool(10);
					return null;

				}
				private Object btn11func() {
					System.out.println("Run.Time.Info:btn11func(args).excounter.");
					changetool(11);
					return null;

				}
				private Object btn12func() {
					System.out.println("Run.Time.Info:btn12func(args).excounter.");
					changetool(12);
					return null;

				}
				private Object btn13func() {
					System.out.println("Run.Time.Info:btn13func(args).excounter.");
					changetool(13);
					return null;

				}
//---------------------------------------------------------------------------
//public main
	public static void main(String[] args) {
    	System.out.println("Run.Time.Info:main(args).excounter.");
    	launch(args);
    }
}
