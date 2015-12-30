package com.thomas.addressbook;

import javafx.fxml.FXMLLoader;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 *
 * @author thomas
 */
public class FXMLLoaderProducer {

    @Inject
    private Instance<Object> instance;

    @Produces
    public FXMLLoader createLoader() {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(param -> instance.select(param).get());
        return loader;
    }
}
