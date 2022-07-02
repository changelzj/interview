package org.example.interview.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 静态代码块式饿汉单例
 * 适用于复杂的实例化
 */
public class Singleton3 {
    
    public static final Singleton3 INSTANCE;
    
    private String info;
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private Singleton3(String info) {
        this.info = info;
    }

    static {
        Properties prop = new Properties();
        InputStream inputStream = Singleton3.class.getClassLoader().getResourceAsStream("info.properties");
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        INSTANCE = new Singleton3(prop.getProperty("info"));
    }
    
    

    
}
