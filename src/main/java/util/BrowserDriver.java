//package util;
//
//import org.openqa.selenium.WebDriver;
//
//public class Browser {
//    private static WebDriver driver = null;
//    private static Integer DEFAULT_TIMEOUT = 30;
//    public static WebDriver getDriver() {
//        if(driver == null) {
//            String pathToDriver = Application.getPathToChromedriver();
//            System.setProperty("webdriver.chrome.driver", pathToDriver);
//            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//            capabilities.setCapability("chrome.switches", Collections.singletonList("--incognito"));
//            driver = new ChromeDriver(capabilities);
//            driver.manage().timeouts().pageLoadTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
//            driver.manage().window().fullscreen();
//        }
//
//        return driver;
//    }
//}
