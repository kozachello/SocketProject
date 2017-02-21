package home.client;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * <h1>View MainApp</h1>
 * GUI til {@link home.client.ClientView }
 * - client view.
 *
 * @author Козак
 */
public class ClientView extends Application {

    private TextArea chatarea = new TextArea(); // main area

    private Parent createContent() { // metode for vores kontent

        TextField input = new TextField();
        chatarea.setPrefHeight(400);
        VBox root = new VBox(20, chatarea);
        root.setPrefSize(600,500);
        return root;

    }

    public void startChat() throws Exception {

        Stage primaryStage = new Stage();
        primaryStage.setTitle("CHAT");
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("StartWindow");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        Text scenetitle = new Text("Type Your Nickname & Start Chat");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 20));
        grid.add(scenetitle, 0, 0, 3, 1);

        Label userName = new Label("Nickname:");
        grid.add(userName, 0, 1);

        TextField userBox = new TextField();
        grid.add(userBox, 1, 1);

        Button button = new Button("Start");
        button.setAlignment(Pos.BASELINE_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(button);
        grid.add(hbox, 1, 4);

        Scene scene = new Scene(grid, 400, 300);

        button.setOnAction(event -> {
            // нужен какой то экшн...
            Client user = new Client(userBox.getText());
            System.out.println(user);
            if(user.usernameIsNotNull()) {
                primaryStage.close();
                try {
                    startChat();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String args[]) {
        //Locale locale = Locale.getDefault(); // не уверен что понадобится
        launch(args);
    }
}
