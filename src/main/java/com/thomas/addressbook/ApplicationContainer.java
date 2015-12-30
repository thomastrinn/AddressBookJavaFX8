package com.thomas.addressbook;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author thomas
 */
public class ApplicationContainer {

    private static class ApplicationContainerLoader {
        private static final ApplicationContainer INSTANCE = new ApplicationContainer();
    }
    
    public static ApplicationContainer getInstance() {
        return ApplicationContainerLoader.INSTANCE;
    }
    
    private final Weld weld;
    private final WeldContainer container;
    
    private ApplicationContainer() {
        if (ApplicationContainerLoader.INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
        
        this.weld = new Weld();
        this.container = weld.initialize();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                weld.shutdown();
            }
        });
    }
    
     public <T> T getBean(Class<T> type) {
        return container.instance().select(type).get();
    }
}
