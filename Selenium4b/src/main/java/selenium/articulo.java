WebElement log1 = driver.findElement(By.name("betja"));
        log1.sendKeys("hola1234");
        Thread.sleep(2000);
        WebElement pass3 = driver.findElement(By.name("password"));
        pass3.sendKeys("12345");
        Thread.sleep(2000);
        WebElement logbtn = driver.findElement(By.xpath("//*[@id=\"entrarSistema\"]"));
        logbtn.click();
        WebElement vender = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a"));
        vender.click();
        Thread.sleep(2000);
        WebElement venderA = driver.findElement(By.xpath("//*[@id=\"ventaProductosBtn\"]"));
        venderA.click();
        Thread.sleep(2000);
        Select sel= new Select (driver.findElement(By.name("clienteVenta")));
        sel.selectByVisibleText("Betjader_4B-DSM");
        Thread.sleep(2000);
        Select sel2 = new Select (driver.findElement(By.name("productoVenta")));
        sel2.selectByVisibleText("Betjader_bulls");
        Thread.sleep(2000);
        WebElement add = driver.findElement(By.xpath("//*[@id=\"btnAgregaVenta\"]"));
        add.click();
        Thread.sleep(2000);
        WebElement generar = driver.findElement(By.xpath("//*[@id=\"tablaVentasTempLoad\"]/table/caption/span"));
        generar.click();
        Thread.sleep(2000);
        WebElement vender = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[4]/div[2]/button"));
        vender.click();
        Thread.sleep(3000);
        WebElement ventagg = driver.findElement(By.xpath("//*[@id=\"ventasHechasBtn\"]"));
        ventaagg.click();
        Thread.sleep(3000);
        }