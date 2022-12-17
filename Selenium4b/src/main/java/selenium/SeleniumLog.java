package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLog {
    public static void main(String[] args) throws InterruptedException {
        String exePath = "src/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://desarrollosenweb.com/examen4BDSM/");

        WebElement admin = driver.findElement(By.name("usuario"));
        admin.sendKeys("betja");

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("hola1234");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"entrarSistema\"]"));
        login.click();
        Thread.sleep(5000);
        WebElement clientes = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
        clientes.click();
        Thread.sleep(5000);
        WebElement name = driver.findElement(By.name("nombre"));
        name.sendKeys("Miguel_4B-DSM");
        WebElement lastname = driver.findElement(By.name("apellidos"));
        lastname.sendKeys("Layun_4B-DSM");
        WebElement direccion = driver.findElement(By.name("direccion"));
        direccion.sendKeys("Santa Maria");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("20213tn032@utez.edu.mx");
        WebElement tel = driver.findElement(By.name("telefono"));
        tel.sendKeys("1234567890");
        WebElement rfc = driver.findElement(By.name("rfc"));
        rfc.sendKeys("1234567890");
        WebElement reg = driver.findElement(By.xpath("//*[@id=\"btnAgregarCliente\"]"));
        reg.click();
        Thread.sleep(3000);
        WebElement admiA = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a"));
        admiA.click();
        WebElement cat = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a"));
        cat.click();
        Thread.sleep(5000);
        WebElement catN = driver.findElement(By.name("categoria"));
        catN.sendKeys("Betjader_Ortiz_4B-DSM");
        WebElement addC = driver.findElement(By.xpath("//*[@id=\"btnAgregaCategoria\"]"));
        addC.click();
        Thread.sleep(5000);
        WebElement admiA1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a"));
        admiA1.click();
        WebElement art = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[2]/a"));
        art.click();
        WebElement select = driver.findElement(By.xpath("//*[@id=\"categoriaSelect\"]"));
        select.click();
        WebElement select1 = driver.findElement(By.xpath("//*[@id=\"categoriaSelect\"]/option[5]"));
        select1.click();
        WebElement namef = driver.findElement(By.name("nombre"));
        namef.sendKeys("Betjader_Ortiz_Chicago_Bulls");
        WebElement desc = driver.findElement(By.name("descripcion"));
        desc.sendKeys("El mejor equipo que existe");
        WebElement cant = driver.findElement(By.name("cantidad"));
        cant.sendKeys("6");
        WebElement precio = driver.findElement(By.name("precio"));
        precio.sendKeys("1000");
        WebElement foto = driver.findElement(By.name("imagen"));
        foto.sendKeys("C:\\zach.png");
        Thread.sleep(2000);
        WebElement addA = driver.findElement(By.xpath("//*[@id=\"btnAgregaArticulo\"]"));
        addA.click();
        Thread.sleep(5000);

        WebElement presalir = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/a"));
        presalir.click();
        WebElement salir = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/ul/li/a"));
        salir.click();
        Thread.sleep(5000);

}
