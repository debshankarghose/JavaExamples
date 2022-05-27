package utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;
import java.util.Properties;

public class writeProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileOutputStream writeFile = null;

/*        String pass = "Deba2021";
        String passEncrypted = Base64.getEncoder().encodeToString(pass.getBytes());
        System.out.println(passEncrypted); //RGViYTIwMjE=
        */

        String passEncrypted = "RGViYTIwMjE=";
        String pass = new String(Base64.getDecoder().decode(passEncrypted));

        try{
            writeFile = new FileOutputStream("config.properties");

            prop.setProperty("Browser", "chrome");
            prop.setProperty("url","https://amazon.com");
            prop.setProperty("username", "debshankar.ghose@live.com");
            prop.setProperty("password", pass); //retrieve the encrypted password using base64.encoder
            prop.store(writeFile, "config definitions created");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writeFile!=null){
                try{
                    writeFile.close();
                } catch(IOException io) {
                    io.printStackTrace();
                }
            }
        }


    }

}
