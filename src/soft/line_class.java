package soft;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class line_class {
	public static void createnew(Color xColor, double d, double e){
		Line li = new Line();
		window_class.layout.getChildren().addAll(li);
		li.setStroke(xColor);
		li.setStrokeWidth(5);
		li.setStartX(d);
		li.setStartY(e);
		li.setEndX(d+window_class.mysize);
		li.setEndY(e+window_class.mysize);
		ScaleTransition tranCir = new ScaleTransition(); 
		tranCir.setDuration(Duration.seconds(4));
		tranCir.setByX(0.5f);
		tranCir.setByY(0.5f);
		tranCir.setCycleCount(Animation.INDEFINITE);
		tranCir.setAutoReverse(true);
		tranCir.setNode(li);
		tranCir.play();
		li.setOnMouseClicked(x -> {if (x.getButton() == MouseButton.SECONDARY) {
			window_class.layout.getChildren().remove(li);
        }});
}
}
