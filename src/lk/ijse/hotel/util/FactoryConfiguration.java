package lk.ijse.hotel.util;

import lk.ijse.hotel.entity.User;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
            sessionFactory = new Configuration()
                    .mergeProperties(Utility.getProperties())
                    .addAnnotatedClass(User.class)

    }
}
