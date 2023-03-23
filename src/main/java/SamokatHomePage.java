import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamokatHomePage {
    private WebDriver driver;
    private By howMuchIsSamokat = By.id("accordion__heading-0");
    private By respond1 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p");
    String textRespond1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private By severalSamokats = By.id("accordion__heading-1");
    private By rentTime = By.id("accordion__heading-2");
    private By samokat4Today = By.id("accordion__heading-3");
    private By stopRent = By.id("accordion__heading-4");
    private By charging = By.id("accordion__heading-5");
    private By cancelOrder = By.id("accordion__heading-6");
    private By outsideMoscow = By.id("accordion__heading-7");

    public SamokatHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void howMuchIsSamokatClick() {
        this.driver.findElement(this.howMuchIsSamokat).click();
    }

    public void severalSamokatsClick() {
        this.driver.findElement(this.severalSamokats).click();
    }

    public void rentTimeClick() {
        this.driver.findElement(this.rentTime).click();
    }

    public void samokat4TodayClick() {
        this.driver.findElement(this.samokat4Today).click();
    }

    public void stopRentClick() {
        this.driver.findElement(this.stopRent).click();
    }

    public void chargingClick() {
        this.driver.findElement(this.charging).click();
    }

    public void cancelOrderClick() {
        this.driver.findElement(this.cancelOrder).click();
    }

    public void outsideMoscowClick() {
        this.driver.findElement(this.outsideMoscow).click();
    }

    public By getRespond1() {
        return this.respond1;
    }
}