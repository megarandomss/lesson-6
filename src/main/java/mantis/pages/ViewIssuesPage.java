package mantis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ViewIssuesPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(css = "#buglist tbody tr")
    private List<WebElement> issues;

    @FindBy(xpath = "//*[@id='buglist']/tbody/tr[1]/td[11]")
    public WebElement firstIssue;

    @FindBy(xpath = "//*[@id='buglist']/tbody/tr[1]/td[4]/a")
    public WebElement firstIssueButton;


    public ViewIssuesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public int countIssues() {
        return issues.size();
    }

    public String getLastCreatedIssueName() {
        return firstIssue.getText();
    }

    public void goToFirstIssuePage() {
        firstIssueButton.click();
    }

}