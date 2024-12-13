package com.qa.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.BaseTest;
import com.qa.pages.LoginPagedemo;
import com.qa.utilities.ReadExcelFile;

public class LoginTest extends BaseTest{
	String fileName = System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
	@Test(priority=1, dataProvider="LoginDataProvider")
	void verifyLogin() {
		LoginPagedemo lp= new LoginPagedemo(driver);
		String username = "demosiri12";
		String password = "Testsiri1234";
		lp.loginPortal(username, password);
	}
	
	@DataProvider(name="LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		int ttlRows= ReadExcelFile.getRowCount(fileName, "LoginData");
		int ttlColumns= ReadExcelFile.getColCount(fileName, "LoginData");
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for (int i=1;i<ttlRows;i++) {
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j] = ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
			}
		}
		return data;
	}

}
