import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testing_signup {
    public static void main(String[] args) throws InterruptedException {
        // Step 2: Set up WebDriverManager to manage browser driver
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the sign-in page
        driver.get("https://react-qa-test.netlify.app/sign-in");

        // Enter Email
        driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys("test@gmail.com");
        System.out.println("Email Entered");

        // Enter Password
        driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("test123");
        System.out.println("Password Entered");

        // Click Sign-in Button (Fixed Syntax)
        driver.findElement(By.xpath("//*[@id='login-submit-button']")).click();
        System.out.println("Form Submitted");

        // Wait for 1 second (Handled Exception)
        Thread.sleep(3000);

        // Close the browser
        driver.quit();
    }
}
