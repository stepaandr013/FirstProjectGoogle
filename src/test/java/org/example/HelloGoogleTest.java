package org.example;

import org.example.pages.GooglePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.slf4j.Logger;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HelloGoogleTest {

    private WebDriver driver;
//    Logger logger = Logger.getLogger(HelloGoogleTest.class);




    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://google.com");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "Selenium", "Automation"})
    public void performSearch(String searchString) throws InterruptedException {

        GooglePage googlePage = new GooglePage(driver);
        googlePage.performSearch(searchString);

        Wait<WebDriver> waiter = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Throwable.class);


//        Assertions.assertFalse(waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(GooglePage.SEARCH_RESULT_LOCATOR)).isEmpty());

        List<WebElement> searchResult = waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(GooglePage.SEARCH_RESULT_LOCATOR));
        Assertions.assertFalse(searchResult.isEmpty());
        googlePage.scrollToElement(searchResult.get(searchResult.size() - 1));
        Thread.sleep(2000);

    }

    @AfterAll
    public void tearDown(){
        driver.close();
    }

}
