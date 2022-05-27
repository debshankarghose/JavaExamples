package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readProperties {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        FileInputStream readFile = null;

        try {
            readFile = new FileInputStream("config.properties");
            prop.load(readFile);

            System.out.println(prop.getProperty("password"));
            System.out.println(prop.getProperty("url"));
            System.out.println(prop.getProperty("Browser"));
            System.out.println(prop.getProperty("username"));

        }catch(IOException io){
            io.printStackTrace();
        }finally{
            if(readFile!=null){
                readFile.close();
            }
        }

    }
}
