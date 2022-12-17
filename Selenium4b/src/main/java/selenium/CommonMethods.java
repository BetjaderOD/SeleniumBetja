package selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CommonMethods {
    public static void takeScreenshot(WebDriver webDriver, String testCaseName) {
        //toma ss sin formato
        File srcfile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        //establecer ruta
        String screemshotPath = "src/test-output/ExecutionResults";
        try {
            FileHandler.createDir(new File(screemshotPath));
            FileHandler.copy(srcfile, new File(screemshotPath
                    + File.separator + testCaseName + ".PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
