package Automation;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FirstCode {
	
	@Test()
	public void basicRun() throws Exception {
		System.out.println("basic run");
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("ShivaEmulator");
		AndroidDriver driver= new AndroidDriver(new URI("http://0.0.0.0:4723").toURL(), options);
	}
}
