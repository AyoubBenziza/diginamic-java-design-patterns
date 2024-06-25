package fr.diginamic.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testGetInstance() {
        Configuration instance = Configuration.getInstance();
        assertNotNull(instance);
    }
    @Test
    public void testGetProperty() {
        Configuration instance = Configuration.getInstance();
        assertEquals("dark", instance.getProperty("theme"));
        assertEquals("Design Patterns", instance.getProperty("title"));
        assertEquals("fr", instance.getProperty("language"));
        assertEquals("root", instance.getProperty("db.user"));
        assertEquals("pw", instance.getProperty("db.password"));
    }

    @Test
    public void testGetPropertyWithNull() {
        Configuration instance = Configuration.getInstance();
        assertNull(instance.getProperty("unknown"));
    }

    @Test
    public void testGetProperties() {
        Configuration instance = Configuration.getInstance();
        assert(instance.getProperties().size() == 5);
    }
}
