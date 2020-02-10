package application;
	


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class Main extends Application implements EventHandler<ActionEvent> {
	
	Button b;
	Button b2;
	int count  = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
			primaryStage.setTitle("Dictionary");
			StackPane p = new StackPane();
			Scene scene = new Scene(p,300,250);
			b = new Button();
			b2 = new Button("Reset");
			b.setText(Integer.toString(count));
			b.setOnAction(this);
			b2.setOnAction(this);
			b2.setTranslateY(30);
			b.setMaxWidth(75);
			b2.setMaxWidth(75);
			p.getChildren().add(b);
			p.getChildren().add(b2);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show(); 

	}
	
	public void handle(ActionEvent event) {
		if(event.getSource() == b) {
			count++;
			b.setText(Integer.toString(count));
		}
		
		if(event.getSource() == b2) {
			count=0;
			b.setText(Integer.toString(count));
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
