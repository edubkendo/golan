package com.devork;

import javafx.application.Application;
import javafx.stage.Stage;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        URL opensans = Main.class.getClassLoader().getResource("com/devork/font/OpenSans-Regular.ttf");
        Font font = Font.createFont(Font.PLAIN, opensans.openStream());


        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
    }

}
