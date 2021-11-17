package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FirstMainPage {

    private final By search_box_element = By.id("benzradio");

    private final By select_Class_Example = By.xpath("//select[@id='carselect']/*");

    private final By checkbox_element_bmw = By.id("bmwcheck");
    private final By checkbox_element_benz = By.id("benzcheck");
    private final By checkbox_element_honda = By.id("hondacheck");

    private final By multiple_Select_elements = By.xpath("//select[@id='multiple-select-example']/*");
    private final By switch_to_Aler_enter_name = By.xpath("//input[@name='enter-name']");
    private final By iFrame_Element = By.xpath("//iframe[@id='courses-iframe']");
    private final By open_window_element = By.xpath("//button[@id='openwindow']");

    public WebElement getRadioBtnExmpl(WebDriver driver) {
        return driver.findElement(search_box_element);
    }

    public WebElement getSelectClassExmpl(WebDriver driver) {

        WebElement element = null;

        List<WebElement> selectCarExampleElements = driver.findElements(select_Class_Example);
        for (int i = 0; i < selectCarExampleElements.size(); i++) {
            element = selectCarExampleElements.get(i).findElement(By.xpath("//option[@value='honda']"));
        }
        return element;
    }

    public List<WebElement> getMultipleSelectWebElements(WebDriver driver) {
        return driver.findElements(multiple_Select_elements);
    }

    public List<WebElement> getListOfCheckBoxElements(WebDriver driver) {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(driver.findElement(checkbox_element_bmw));
        webElements.add(driver.findElement(checkbox_element_benz));
        webElements.add(driver.findElement(checkbox_element_honda));

        return webElements;
    }

    public WebElement enterNameSwithToAlerTextBox(WebDriver driver) {
        return driver.findElement(switch_to_Aler_enter_name);
    }

    public WebElement switchToIframe(WebDriver driver) {
        return driver.findElement(iFrame_Element);

    }
    public WebElement getNewWindow(WebDriver driver){
        return driver.findElement(open_window_element);
    }
}
