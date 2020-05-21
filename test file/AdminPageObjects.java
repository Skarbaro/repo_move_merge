package homework2;

import homework3.AdminPageDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AdminPageObjects {

    private WebDriver webDriver;

    public AdminPageObjects(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    public WebElement emailField() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            return webDriver.findElement(By.id("email"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement passwordField() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
            return webDriver.findElement(By.id("passwd"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement submitButton() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submitLogin")));
            return webDriver.findElement(By.name("submitLogin"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement employeeNameDropdownToggle() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='employee_avatar_small']")));
            return webDriver.findElement(By.xpath("//span[@class='employee_avatar_small']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement logoutLink() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header_logout")));
            return webDriver.findElement(By.id("header_logout"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement menuItem(String itemText) {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), '" + itemText + "')]")));
            return webDriver.findElement(By.xpath("//span[contains(text(), '" + itemText + "')]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void printTitleText() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        Thread.sleep(2000);
        System.out.println(webDriver.getTitle());
    }

    public void refreshPage() {
        webDriver.navigate().refresh();
    }

    public WebElement categoriesSubMenuItem() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subtab-AdminCategories")));
            return webDriver.findElement(By.id("subtab-AdminCategories"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement catalogMenuItem() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subtab-AdminCatalog")));
            return webDriver.findElement(By.id("subtab-AdminCatalog"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement addNewCategoryButton() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("page-header-desc-category-new_category")));
            return webDriver.findElement(By.id("page-header-desc-category-new_category"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement categoryNameField() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name_1")));
            return webDriver.findElement(By.id("name_1"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement saveNewCategoryButton() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("category_form_submit_btn")));
            return webDriver.findElement(By.id("category_form_submit_btn"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement successMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success']")));
            return webDriver.findElement(By.xpath("//div[@class='alert alert-success']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement searcByNameField() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("categoryFilter_name")));
            return webDriver.findElement(By.name("categoryFilter_name"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement searcByNameButton() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitFilterButtoncategory")));
            return webDriver.findElement(By.id("submitFilterButtoncategory"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement searcByNameElement() {
        try {
            AdminPageDrivers adminPageDriver = new AdminPageDrivers();
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(), '" + adminPageDriver.categoryName() + "')]")));
            return webDriver.findElement(By.xpath("//td[contains(text(), '" + adminPageDriver.categoryName() + "')]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
