import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GlobalProperties {
    private static Properties properties;
    private static boolean DEBUG;
    private static boolean computeFeatures = true;

    public static Properties getProperties(){
        if(properties == null){
            String defaultPath = "config"+ File.separator+"QuestionTransducer.properties";
            loadProperties(defaultPath);
        }
        return properties;
    }

    public static void loadProperties(String propertiesFile){
        if(!(new File(propertiesFile).exists())){
            System.err.println("properties file not found at the location, "+propertiesFile+".  Please specify with --properties PATH.");
            System.exit(0);
        }

        properties = new Properties();
        try{
            properties.load(new FileInputStream(propertiesFile));
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void setDebug(boolean debug) {
        DEBUG = debug;
    }

    public static boolean getDebug() {
        return DEBUG;
    }

    public static void setComputeFeatures(boolean b) {
        computeFeatures = b;
    }


    public static boolean getComputeFeatures(){
        return computeFeatures;
    }
}
