package com.mkyong;

import org.junit.Test;
import sun.misc.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ApplicationTest {
    @Test
    public void loadXMLTest(){
        ClassLoader classLoader = getClass().getClassLoader();
        try(InputStream inputStream = classLoader.getResourceAsStream("sysConfig.properties")){
            Properties prop = new Properties();
            if(inputStream == null){
                System.out.println("Sorry, unable to find properties!");
                return;
            }
            prop.load(inputStream);
            System.out.println(prop.getProperty("defaultDB"));

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
