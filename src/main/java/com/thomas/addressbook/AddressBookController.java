package com.thomas.addressbook;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author thomas
 */
public class AddressBookController {

    @FXML
    private TableView<PersonDataModel> adressBookTableView;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField emailField;

    @FXML
    protected void addPerson(ActionEvent event) {
        ObservableList<PersonDataModel> data = adressBookTableView.getItems();
        data.add(new PersonDataModel(
                firstNameField.getText(),
                lastNameField.getText(),
                emailField.getText()
        ));

        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
    }

    @FXML
    protected void initialize() {
        
    }

}
