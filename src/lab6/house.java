package lab6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class house extends Application{

	public void start(Stage primaryStage) {
		Rectangle rec = new Rectangle(100, 80, 150, 100); 
		rec.setFill(Color.ORANGE);
		
		Polygon tri = new Polygon();
		tri.getPoints().addAll(new Double[]{250.0, 80.0,175.0, 40.0, 100.0, 80.0 });  
		tri.setFill(Color.ORANGE);
		
		Line roof1 = new Line(251,80,175,40);
		roof1.setStroke(Color.BLUE);
		roof1.setStrokeWidth(6);
		
		Line roof2 = new Line(100,80,175,40);
		roof2.setStroke(Color.BLUE);
		roof2.setStrokeWidth(6);
		
		Line gutter = new Line(251,80,100,80);
		gutter.setStroke(Color.BLACK);
		gutter.setStrokeWidth(2);
		
		Rectangle door = new Rectangle(160, 125, 30, 55);
		door.setFill(Color.RED);
		
		Circle doorknob = new Circle(164,155,3);
		doorknob.setFill(Color.BLACK);
		
		Rectangle window1 = new Rectangle(120, 95, 35, 30);
		window1.setFill(Color.SNOW);
		window1.setStroke(Color.BLACK);
		
		Rectangle window2 = new Rectangle(195, 95, 35, 30);
		window2.setFill(Color.SNOW);
		window2.setStroke(Color.BLACK);
		
		Rectangle chimney = new Rectangle(105,45,20,30);
		chimney.setFill(Color.DARKGREY);
		
		Circle smoke1 = new Circle(110,40,5);
		smoke1.setFill(Color.AZURE);
		
		Circle smoke2 = new Circle(100,35,10);
		smoke2.setFill(Color.AZURE);
		
		Circle smoke3 = new Circle(90,30,15);
		smoke3.setFill(Color.AZURE);
		
		 Ellipse cloud = new Ellipse(200,15,20,10);  
		 cloud.setFill(Color.AZURE);  
		 
		 Ellipse cloud1 = new Ellipse(210,15,20,10);  
		 cloud1.setFill(Color.AZURE);
		

		Group root = new Group(rec, chimney, tri, gutter, roof1, roof2, door, doorknob, window1, window2, smoke1, smoke2, smoke3, cloud, cloud1);

		Scene scene = new Scene(root, 500, 200, Color.AQUAMARINE);

		primaryStage.setTitle("House");
		primaryStage.setScene(scene);
		primaryStage.show();	

	}
	public static void main(String[] args) {
		launch(args);

	}

}
