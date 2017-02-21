package home.client;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Козак on 14.02.2017.
 */
public class ClientDesktop extends Application {

    private TextArea chatarea = new TextArea(); // main area

    private Parent createContent() { // metode for vores kontent
        TextField input = new TextField();
        chatarea.setPrefHeight(400);
        VBox root = new VBox(20, chatarea);
        root.setPrefSize(600,500);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("CHAT");
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();

    }

    /*public static void showChat()  {
        launch();
    }*/

    public static void main(String args[]) {
        launch(args);
    }
}
