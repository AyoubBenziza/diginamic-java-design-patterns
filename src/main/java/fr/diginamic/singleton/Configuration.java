package fr.diginamic.singleton;

import java.util.HashMap;
import java.util.ResourceBundle;

public class Configuration {

    private static final Configuration INSTANCE = new Configuration();

    private final HashMap<String, String> properties = new HashMap<>();

    private Configuration() {
        init();
    }

    private void init() {
        ResourceBundle configuration = ResourceBundle.getBundle("configuration");
        for (String key : configuration.keySet()) {
            properties.put(key, configuration.getString(key));
        }
    }

    public static Configuration getInstance() {
        return INSTANCE;
    }

    public HashMap<String, String> getProperties() {
        return properties;
    }

    public String getProperty(String key) {
        return properties.get(key);
    }
}
