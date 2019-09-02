package soft;
import java.awt.MouseInfo;
import java.awt.Point;
import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
public class brush_class  {
	public static void draw(Color xColor, double d, double e){
		for (int i=0;i<100;i++) {
					Point p = MouseInfo.getPointerInfo().getLocation();
					p = MouseInfo.getPointerInfo().getLocation();
					System.out.println(p.getX() + " " + p.getY());
					System.out.println("make circle");
					draw11(xColor, p.getX(), p.getY());
					try {
						Thread.sleep(1);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
		}
	}//end thread

	private static void draw11(Color xColor, double d, double e) {

		System.out.println("make circle");
		Circle cir2 = new Circle();
		cir2.setRadius(window_class.mysize);
		cir2.setFill(xColor);
		cir2.setLayoutX(d);
		cir2.setLayoutY(e);
		window_class.layout.getChildren().addAll(cir2);
		cir2.setLayoutX(d);
		cir2.setLayoutY(e);
		ScaleTransition tranCir = new ScaleTransition(); 
		tranCir.setDuration(Duration.seconds(4));
		tranCir.setByX(window_class.myspeed);
		tranCir.setByY(window_class.myspeed);
		tranCir.setCycleCount(Animation.INDEFINITE);
		tranCir.setAutoReverse(true);
		tranCir.setNode(cir2);
		tranCir.play();
		cir2.setOnMouseClicked(x -> {if (x.getButton() == MouseButton.SECONDARY) {
		window_class.layout.getChildren().remove(cir2);
		}
	});
	}


}			
		


