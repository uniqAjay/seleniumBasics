package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImp implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " Test Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName() + " Test success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " Test failed");
		
	}
	
	

}
