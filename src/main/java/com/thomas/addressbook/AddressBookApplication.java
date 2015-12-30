package com.thomas.addressbook;

import com.thomas.addressbook.ui.AddressBookView;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author thomas
 */
public class AddressBookApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationContainer container = ApplicationContainer.getInstance();
        
        container.getBean(AddressBookView.class).start(primaryStage, getParameters());
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }

}
