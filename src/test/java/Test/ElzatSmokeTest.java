package Test;

import Pages.HomePage;
import Pages.InventoryPage;
import Pages.ProductMovePage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class ElzatSmokeTest extends TestBase {

    @Test(groups = "smoke")
    public void ProductMovePageTest() throws InterruptedException{
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        driver.get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Odoo");
        homePage.DatabaseDropDown.click();
        Assert.assertEquals(driver.getTitle(),"Login | Website localhost");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");
        inventoryPage.productMove.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Product Moves - Odoo");
        System.out.println("ProductMovePageTest Passed");


    }

    @Test(groups = "smoke")
    public void SunnySunPageTest() throws InterruptedException{
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        driver.get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Odoo");
        homePage.DatabaseDropDown.click();
        Assert.assertEquals(driver.getTitle(),"Login | Website localhost");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");
        inventoryPage.sunnySun.click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getTitle().contains("YourCompany: SunnySun"));
        System.out.println("SunnySunPageTest Passed");
    }

    @Test(groups = "smoke")
    public void SunnySunAdvanceSearchTest() throws InterruptedException{
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();
        ProductMovePage productMovePage = new ProductMovePage();

        driver.get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Odoo");
        homePage.DatabaseDropDown.click();
        Assert.assertEquals(driver.getTitle(),"Login | Website localhost");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Inventory - Odoo");
        inventoryPage.productMove.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Product Moves - Odoo");
        productMovePage.advancedSearchButton.click();
        Assert.assertTrue(productMovePage.advancedSearchOptions.isDisplayed());
        System.out.println("SunnySunAdvancedSearchTest Passed");

    }
}
