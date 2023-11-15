package lk.ijse.hotel.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        sessionFactory = new Configuration()
                .mergeProperties(Utility.getProperties())
                .addA
    }
}
