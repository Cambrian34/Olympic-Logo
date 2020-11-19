import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

//************************************************************************
// olympicLogo.java            Author Alistair Chambers
//
// Demonstrates the translation of a set of shapes.
//************************************************************************
public class olympicLogo extends Application{
	public void start(Stage primaryStage) {
		Circle blueRing = new Circle(180, 70, 30);
		blueRing.setStroke(Color.BLUE);
		blueRing.setStrokeWidth(6);
		blueRing.setFill(null);
		
		Circle yellowRing = new Circle(210, 100, 30);
		yellowRing.setStroke(Color.YELLOW);
		yellowRing.setStrokeWidth(6);
		yellowRing.setFill(null);
		
		Circle blackRing = new Circle(250, 70, 30);
		blackRing.setStroke(Color.BLACK);
		blackRing.setStrokeWidth(6);
		blackRing.setFill(null);
		
		Circle greenRing = new Circle(280, 100, 30);
		greenRing.setStroke(Color.GREEN);
		greenRing.setStrokeWidth(6);
		greenRing.setFill(null);
		
		Circle redRing = new Circle(320, 70, 30);
		redRing.setStroke(Color.RED);
		redRing.setStrokeWidth(6);
		redRing.setFill(null);
		
		Group root = new Group(blueRing, redRing, yellowRing, blackRing, greenRing);
		
		Scene scene = new Scene(root, 500, 200);
		
		primaryStage.setTitle("Olympic Logo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
