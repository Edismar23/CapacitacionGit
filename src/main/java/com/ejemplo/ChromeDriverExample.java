package com.ejemplo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class ChromeDriverExample {

    public static void main(String[] args) throws Exception {
        String path = Paths.get(System.getProperty("user.dir"), "./DriverChrome/chromedriver.exe").toString();
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.cl/");
        Thread.sleep(5000);
        driver.close(); //cierra la ventana activa
        driver.quit(); //cierra el navegador completamente
    }

}
