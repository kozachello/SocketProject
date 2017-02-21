package home.client;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Козак on 13.02.2017.
 */
public class ClientView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("application");
        GridPane grid = new GridPane();
        TextField text = new TextField();
        text.setAlignment(Pos.CENTER);
        Button button = new Button("start");
        button.setAlignment(Pos.CENTER);
        grid.add(text, 2, 2);
        grid.add(button, 4, 2);
        Scene scene = new Scene(grid, 280, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}
