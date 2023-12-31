package org.automation.generic_utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Sumanth
 *
 */
public class JavaScriptUtil {

	private JavascriptExecutor javaScript;
	
	public JavaScriptUtil(WebDriver driver) {
		javaScript = (JavascriptExecutor) driver;
	}
	
	/**
	 * This method is used to perform Click operation using JavascriptExecutor
	 * @param element pass the web element on which click action has to be performed
	 */
	public void jsClick(WebElement element) {
		javaScript.executeScript("arguments[0].click();", element);
	}

	/**
	 * This method is used to send the data to a text filed using JavascriptExecutor
	 * @param element pass the text box element in which data has to be passed
	 */
	public void jsSendkeys(String data,WebElement element) {
		javaScript.executeScript("arguments[0].value='"+data+"';", element);
	}
	
	/**
	 * This method is used to perform scrolling action in X and Y direction using JavascriptExecutor
	 * @param x pass the X pixels value (distance in X direction)
	 * @param y pass the Y pixels value (distance in Y direction)
	 */
	public void jsScrollBy(int X,int Y) {
		javaScript.executeScript("window.scrollBy("+X+","+Y+")");
	}

	/**
	 * This method is used to perform scrolling action to a particular coordinate values using JavascriptExecutor
	 * @param X give the X-coordinate value
	 * @param Y give the Y-coordinate value
	 */
	public void jsScrollTo(int X,int Y) {
		javaScript.executeScript("window.scrollTo("+X+","+Y+")");
	}

	/**
	 * This method is used to scroll upto an element 
	 * @param bool if given true it will match the top of the element to top of the page and vice versa
	 * @param element upto which you want to scroll
	 */
	public void jsScrollIntoView(boolean bool,WebElement element) {
		javaScript.executeScript("arguments[0].scrollIntoView("+bool+")",element);
	}
}
