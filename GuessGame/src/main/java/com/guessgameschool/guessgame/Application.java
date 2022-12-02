package com.guessgameschool.guessgame;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 650);
        stage.setResizable(false);
        stage.setTitle("The Guess Game");
        stage.setScene(scene);
        stage.show();

        new CountDownTimerExample();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        launch();
    }
}