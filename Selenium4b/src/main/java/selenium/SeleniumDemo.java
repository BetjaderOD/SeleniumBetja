package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        String exePath="src/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver =new ChromeDriver();
        driver.get("http://desarrollosenweb.com/examen4BDSM/");
        //prueba1234

   WebElement admin = driver.findElement(By.name("usuario"));
   admin.sendKeys("admin");

        WebElement pass = driver.findElement(By.name("password"));
       pass.sendKeys("Holamundo123");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"entrarSistema\"]"));
        login.click();

        Thread.sleep(5000);
        WebElement adminU = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
        adminU.click();
        Thread.sleep(5000);
        WebElement name = driver.findElement(By.name("nombre"));
        name.sendKeys("Betjader");
        WebElement lastname = driver.findElement(By.name("apellido"));
        lastname.sendKeys("Ortiz");
        WebElement user = driver.findElement(By.name("usuario"));
        user.sendKeys("betja");
        WebElement upass = driver.findElement(By.name("password"));
        upass.sendKeys("hola1234");
        WebElement reg = driver.findElement(By.xpath("//*[@id=\"registro\"]"));
        reg.click();
        WebElement presalir = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[6]/a"));
        presalir.click();
        WebElement salir = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[6]/ul/li/a"));
        salir.click();
        Thread.sleep(5000);







//        WebElement select = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[2]/div/div/div[2]/div[2]/form/fieldset/button"));
//         select.click();
//        WebElement historial = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a"));
//        historial.click();
//        WebElement c = driver.findElement(By.xpath("//*[@id=\"cerrarSesion\"]"));
//        c.click();

//       driver.manage().window().maximize();
//        WebElement select = driver.findElement(By.name("fromPort"));
//        select.click();
//        Thread.sleep(1000);
//        WebElement btnMexico = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]/option[6]"));
//        btnMexico.click();
//        Thread.sleep(1000);
//        WebElement btnLondon = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]/option[3]"));
//        btnLondon.click();
//        Thread.sleep(1000);
//        WebElement btnSend = driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));
//        btnSend.click();
//        WebElement btnAereo= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[5]/td[1]/input"));
//        btnAereo.click();
//        WebElement name = driver.findElement(By.name("inputName"));
//        name.sendKeys("betja");
//        WebElement address = driver.findElement(By.name("address"));
//        address.sendKeys("santa maria");
//        WebElement city = driver.findElement(By.name("city"));
//        city.sendKeys("Cuernavaca");
//        WebElement state = driver.findElement(By.name("state"));
//        state.sendKeys("betja");
//        WebElement card = driver.findElement(By.name("creditCardNumber"));
//        card.sendKeys("123456789");
//        WebElement mes = driver.findElement(By.name("creditCardMonth"));
//        mes.sendKeys("12");
//        WebElement year = driver.findElement(By.name("creditCardYear"));
//        year.sendKeys("2025");
//        WebElement nameC = driver.findElement(By.name("nameOnCard"));
//        nameC.sendKeys("betjader");
//        WebElement btnFinal= driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
//        btnFinal.click();
//
//        WebElement pass = driver.findElement(By.name("password"));
//        WebElement btnBuscar = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//        Thread.sleep(200);
//        username.sendKeys("Admin");
//        Thread.sleep(20000);
//        pass.sendKeys("admin123");
//        Thread.sleep(20000);
//        btnBuscar.click();
//        Thread.sleep(20000);
//        btnBuscar.click();
///       WebElement buscar = driver.findElement(By.name("q"));
//        buscar.sendKeys("UTEZ");
//        Thread.sleep(500);
//        WebElement btnBuscar = driver.findElement(By.name("btnK"));
//        btnBuscar.click();
//        String tituloPagina=driver.getTitle();
//        System.out.println("Titulo de la pagina de resultado de busqueda: " +tituloPagina );
//        String urlAxctual = driver.getCurrentUrl();
//        System.out.println("La url actal es : " +urlAxctual);
//        driver.navigate().back();
//        Thread.sleep(500);
//        driver.navigate().forward();
//        Thread.sleep(1500);



        }


    }

