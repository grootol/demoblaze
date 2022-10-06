package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private String property_file = "./src/test/resources/property/config.properties";
    private Properties prop;
    public String URL;
    public String browser;
    public String name;
    public String credit_card;

    public PropertyReader(){
        initProp();
        loadData();
    }

    public void initProp() {
        this.prop = new Properties();
        try {
            FileInputStream fileStream = new FileInputStream(property_file);
            prop.load(fileStream);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadData(){
        URL = getData("URL");
        browser = getData("BROWSER");
    }

    public String getData(String key){
        return prop.getProperty(key);
    }
}