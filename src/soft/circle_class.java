package soft;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class circle_class {
	
		public static void createnew(Color xColor, double d, double e){
			Circle cir2 = new Circle();
			cir2.setRadius(window_class.mysize);
			cir2.setFill(xColor);
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
	        }});
			
			
			
			
		}
}			
		


