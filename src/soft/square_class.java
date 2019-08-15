package soft;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class square_class {
	
		public static void createnew(Color xColor, double d, double e){
			Rectangle cir2 = new Rectangle();
			cir2.setWidth(window_class.mysize*2);
			cir2.setHeight(window_class.mysize*2);
			cir2.setFill(xColor);
			window_class.layout.getChildren().addAll(cir2);
			cir2.setLayoutX(d);
			cir2.setLayoutY(e);
			ScaleTransition tranCir = new ScaleTransition(); 
			tranCir.setDuration(Duration.seconds(4));
			tranCir.setByX(0.5f);
			tranCir.setByY(0.5f);
			tranCir.setCycleCount(Animation.INDEFINITE);
			tranCir.setAutoReverse(true);
			tranCir.setNode(cir2);
			tranCir.play();
			cir2.setOnMouseClicked(x -> {if (x.getButton() == MouseButton.SECONDARY) {
				window_class.layout.getChildren().remove(cir2);
	        }});
			
			
			
			
		}
}			
		


