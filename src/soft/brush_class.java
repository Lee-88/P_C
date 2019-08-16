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

public class brush_class {
	static boolean pressed = true;
	
		public static void createnew(Color xColor, double d, double e) throws InterruptedException{
				for (int i=0;i<1225;i++) {
					Point p = MouseInfo.getPointerInfo().getLocation();
					p = MouseInfo.getPointerInfo().getLocation();
					System.out.println(p.getX() + " " + p.getY());
					draw(xColor, p.getX(), p.getY());
					Thread.sleep(1);
					//brush_class.createnew(xColor, d, e);
				}
		}

		private static void draw(Color xColor, double d, double e) {
			System.out.println("make circle");
			Circle cir2 = new Circle();
			cir2.setRadius(window_class.mysize);
			cir2.setFill(xColor);
			cir2.setLayoutX(d);
			cir2.setLayoutY(e);
			window_class.layout.getChildren().addAll(cir2);
		}
}			
		


