package com.thomas.addressbook;

import java.io.IOException;
import java.io.InputStream;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javax.inject.Inject;

/**
 *
 * @author thomas
 */
public class ViewLoader {

    @Inject
    private FXMLLoader fxmlLoader;

    public Pane load(String fxml) throws IOException {
        final InputStream fxmlInputStream = getClass().getClassLoader().getResourceAsStream(fxml);
        if (fxmlInputStream == null) {
            throw new IllegalArgumentException("FXML: '" + fxml + "' not found!");
        }
        return fxmlLoader.load(fxmlInputStream);
    }

}
