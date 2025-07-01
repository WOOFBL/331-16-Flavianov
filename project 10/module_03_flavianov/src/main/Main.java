package main;

import main.java.controllers.MainController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main.java
public class Main extends Application {
    @Override
    public void start(Stage stage) {
        MainController controller = new MainController(stage);
        controller.showPartnerList();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}