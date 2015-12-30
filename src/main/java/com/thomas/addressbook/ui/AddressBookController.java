package com.thomas.addressbook.ui;

import com.thomas.addressbook.business.PersonLoader;
import com.thomas.addressbook.business.PersonSaver;
import com.thomas.addressbook.business.entity.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.inject.Inject;

/**
 *
 * @author thomas
 */
public class AddressBookController {

    @Inject
    private PersonLoader personLoader;
    @Inject
    private PersonSaver personSaver;

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
        personSaver.save(new Person(
                firstNameField.getText(),
                lastNameField.getText(),
                emailField.getText()));

        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        
        loadPersons();
    }

    @FXML
    protected void initialize() {
        loadPersons();
    }

    private void loadPersons() {
        ObservableList<PersonDataModel> model = FXCollections.observableArrayList();
        personLoader.loadAll().forEach(person -> model.add(convert(person)));
        adressBookTableView.setItems(model);
    }

    private PersonDataModel convert(final Person person) {
        return new PersonDataModel(person.getFirstName(), person.getLastName(), person.getEmail());
    }
}
