package com.thomas.addressbook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javax.inject.Inject;

/**
 *
 * @author thomas
 */
public class FxMain {

    @Inject
    private FXMLLoader fxmlLoader;

    public void start(Stage stage, Application.Parameters parameters) {
        stage.setTitle("Adress Book");
        stage.setWidth(300);
        stage.setHeight(400);
        stage.setResizable(false);
        
        stage.show();
    }
}
