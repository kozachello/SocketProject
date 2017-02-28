package home.client;

import home.server.ThreadControl;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Козак on 14.02.2017.
 */
public class ClientDesktop extends ClientView {

    private TextArea chatarea = new TextArea(); // main area

    private Parent createContent() { // metode for vores kontent

        ThreadControl t;
        String clientId;
        TextField input = new TextField();
        input.setPrefHeight(30);
        chatarea.setPrefHeight(420);
        VBox root = new VBox(30, chatarea, input);
        root.setPrefSize(600, 500);
        return root;

    }

    public void startChat(Client chatMember) throws Exception {

        Stage primaryStage = new Stage();
        if (chatMember.isClientThere(chatMember.getUsername())) {

            primaryStage.setTitle("CHAT");
            primaryStage.setScene(new Scene(createContent()));
            primaryStage.show();
        }
        if(!primaryStage.isShowing()) {
            chatMember.removeClient();
        }

    }
}
