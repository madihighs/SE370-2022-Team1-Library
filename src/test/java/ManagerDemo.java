import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://library.carlsbadca.gov/");
        System.out.println(driver.getTitle());
        //enter cookbook in search bar
//        driver.findElement(By.name("searchbox")).sendKeys("cookbook");
        WebElement e = driver.findElement(By.id("searchbox"));
        boolean isPresent = driver.findElements(By.id("searchbox")).size() > 0;
//        WebElement m = driver.findElement(By.xpath("//input[@id=' session_key']"));
//        WebElement n =
//                driver.findElement(By.cssSelector("input[id=' session_key']"));
        System.out.println("isPresent: " + isPresent);
        System.out.println(e);


        //wait for results
//        WebDriverWait wait=new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbtc")));
//
//        WebElement list=driver.findElement(By.className("sbtc"));
//        List rows=list.findElements(By.tagName("li"));
//
//        for(WebElement elem:rows) {
//            System.out.println(elem.getText());


        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}
