package home.client;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Locale;

/**
 * <h1>View MainApp</h1>
 * GUI til {@link home.client.ClientView }
 * - client view.
 *
 * @author Alex
 */
public class ClientView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //AppLogic appLogic = new AppLogic();
        primaryStage.setTitle("MainApp");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        Text scenetitle = new Text("Добро Пожаловать");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Login:");
        grid.add(userName, 0, 1);

        TextField userBox = new TextField();
        grid.add(userBox, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField passBox = new PasswordField();
        grid.add(passBox, 1, 2);

        Button button = new Button("log in");
        button.setAlignment(Pos.BASELINE_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(button);
        grid.add(hbox, 1, 4);

        Scene scene = new Scene(grid, 400, 300);

        button.setOnAction(event -> {

        });

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String args[]) {
        Locale.setDefault(Locale.GERMANY);
        launch(args);
    }
}
