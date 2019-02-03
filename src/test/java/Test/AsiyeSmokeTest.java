package Test;

import Pages.HomePage;
import Pages.InventoryPage;
import Pages.ProductsPage;
import Pages.ReorderingRulesPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsiyeSmokeTest extends TestBase {

    @Test(groups = "smoke")
    public void ProductsPageTest() throws InterruptedException {

        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();
        ProductsPage productsPage = new ProductsPage();
        driver.get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Odoo");
        homePage.DatabaseDropDown.click();
        Assert.assertEquals(driver.getTitle(), "Login | Website localhost");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Inventory - Odoo");
        inventoryPage.products.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Products - Odoo");
    }


    @Test(groups = "smoke")
    public void ReorderingRulesPageTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        InventoryPage inventoryPage = new InventoryPage();

        ReorderingRulesPage reorderingRulesPage = new ReorderingRulesPage();
        driver.get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Odoo");
        homePage.DatabaseDropDown.click();
        Assert.assertEquals(driver.getTitle(), "Login | Website localhost");
        homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        homePage.SignInButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "#Inbox - Odoo");
        homePage.InventoryPage.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Inventory - Odoo");
        inventoryPage.reorderingRules.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Reordering Rules - Odoo");





    }

}



