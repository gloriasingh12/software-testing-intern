/* * PROJECT: Web Automation Testing
 * TASK 43: Selenium WebDriver Integration
 * DELIVERABLE: Automation Script for Login & Navigation
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    public static void main(String[] args) {
        // 1. Setup Chrome Driver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // 2. Open Application
            driver.get("https://example-web-app.com/login");
            driver.manage().window().maximize();

            // 3. Perform Login
            driver.findElement(By.id("username")).sendKeys("aditya_tripathi");
            driver.findElement(By.id("password")).sendKeys("test@123");
            driver.findElement(By.name("login-button")).click();

            // 4. Navigation Testing
            String expectedUrl = "https://example-web-app.com/dashboard";
            if (driver.getCurrentUrl().equals(expectedUrl)) {
                System.out.println("✅ Test Passed: Login Successful!");
            } else {
                System.out.println("❌ Test Failed: URL Mismatch!");
            }

            // 5. Navigate to Profile
            driver.findElement(By.linkText("Profile")).click();
            System.out.println("✅ Test Passed: Navigation to Profile Working!");

        } catch (Exception e) {
            System.out.println("❌ Error during test execution: " + e.getMessage());
        } finally {
            // 6. Close Browser
            driver.quit();
        }
    }
}
