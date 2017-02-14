package home.client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Козак on 13.02.2017.
 */
public class ClientView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("fx");
        Pane pane = new Pane();
        Text text = new Text("hello");
        pane.getChildren().add(text);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}
