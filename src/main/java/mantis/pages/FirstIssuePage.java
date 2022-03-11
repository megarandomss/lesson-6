package mantis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FirstIssuePage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(css = ".bug-summary[colspan]")
    private WebElement firstIssueName;

    @FindBy(css = "[value='Delete']")
    private WebElement deleteButton;

    public FirstIssuePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public String getFirstIssueName() {
        return firstIssueName.getText();
    }

    public void delete() {
        deleteButton.click();
    }


}