package fr.diginamic.singleton;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void testGetProperty() {
        Configuration instance = Configuration.getInstance();
        assert(instance.getProperty("theme").equals("dark"));
        assert(instance.getProperty("title").equals("Design Patterns"));
        assert(instance.getProperty("language").equals("fr"));
        assert(instance.getProperty("db.user").equals("root"));
        assert(instance.getProperty("db.password").equals("pw"));
    }

    @Test
    public void testGetProperties() {
        Configuration instance = Configuration.getInstance();
        assert(instance.getProperties().size() == 5);
    }
}
