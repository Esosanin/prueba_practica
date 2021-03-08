import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Establecemos la propiedad webdriver.chrome.driver
        //con la ubicación del chromedriver que descargamos
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //Creamos una nueva instancia de ChromeDriver
        WebDriver driver = new ChromeDriver();

        //Hacemos una llamada a esta página
        driver.get("http://www.bibliotecas.uson.mx/");

        //Buscamos por nombre la entrada de texto
        WebElement autocomplete = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBuscar"));

        autocomplete.sendKeys("Java");

        //WebElement autocompleteResult = driver.findElement(By.className("riTextBox riFocused"));
        //autocompleteResult.click();

        WebElement buscar = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnBuscar_input"));
        buscar.click();

        Thread.sleep(1000);

        WebElement verFicha = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridResultados_ctl00_ctl04_LinkButton1"));
        verFicha.click();

        //Cerramos el navegador
        driver.quit();

    }
}