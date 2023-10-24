import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(options);
     // wd.get("https://www.google.com/");
        wd.navigate().to("https://www.google.com/");
      //wd.navigate().back();
      //wd.navigate().forward();
      //wd.navigate().refresh();

        wd.close();   // only one tab, if tab only 1 -> close browser
       // wd.quit();    // all tabs & close browser
    }
}
