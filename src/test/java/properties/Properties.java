package properties;

import java.io.FileInputStream;
import java.io.IOException;

public class Properties {
    public static java.util.Properties getProp()  {
        java.util.Properties props = new java.util.Properties();

        FileInputStream file = null;
        try {
            file = new FileInputStream("src/test/java/properties/dados.properties");
            props.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return props;
    }

}