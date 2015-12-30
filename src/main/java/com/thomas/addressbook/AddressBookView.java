package com.thomas.addressbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.inject.Inject;

/**
 *
 * @author thomas
 */
public class AddressBookView {
    
    private static final String ADDRESS_BOOK_FXML = "view/addressBook.fxml";

    @Inject
    private ViewLoader viewLoader;

    public void start(Stage stage, Application.Parameters parameters) throws Exception {
        stage.setTitle("Address Book");
        stage.setResizable(false);
        
        stage.setScene(new Scene(viewLoader.load(ADDRESS_BOOK_FXML)));
        stage.show();
    }
}
