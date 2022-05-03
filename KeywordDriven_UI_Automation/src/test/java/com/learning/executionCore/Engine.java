package com.learning.executionCore;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.openqa.selenium.By;

import com.learning.ActionKeywords.ActionKeywords;
import com.learning.Utilities.ExcelUtilities;
import com.learning.Utilities.Locators;
import com.learning.constants.Constants;


public class Engine {
	ActionKeywords ActionKeywords;
	Method[] methods;
	static String Keyword;
	public static By Locator;
	
	public void getKeywordsFromActions() {

		ActionKeywords= new ActionKeywords();
		methods=ActionKeywords.getClass().getMethods();

	}
	public void executeKeywords() throws Exception {
		for(int i=0;i<methods.length;i++)
		{
			if(methods[i].getName().equalsIgnoreCase(ExcelUtilities.ActionColumn1)) {

				methods[i].invoke(ActionKeywords);
				break;
			};

		}}
	public void findWebElementsToBeUsed() {
		switch (ExcelUtilities.LocatorName) {
		case Constants.ID:
			Locator=Locators.getId(ExcelUtilities.LocatorValue);
			break;
		case Constants.NAME:
			Locator=Locators.getName(ExcelUtilities.LocatorValue);
			break;
		case Constants.CLASSNAME:
			Locator=Locators.getClassName(ExcelUtilities.LocatorValue);
			break;
		case Constants.XPATH:
			Locator=Locators.getXpath(ExcelUtilities.LocatorValue);
			break;
		case Constants.LINKTEXT:
			Locator=Locators.getLinkText(ExcelUtilities.LocatorValue);
			break;
		case Constants.PARTIALLINKTEXT:
			Locator=Locators.getPartialLinkText(ExcelUtilities.LocatorValue);
			break;
		case Constants.CSSSELECTOR:
			Locator=Locators.getCssSelector(ExcelUtilities.LocatorValue);
			break;
		
		
		case Constants.TAGNAME:
			Locator=Locators.getTagName(ExcelUtilities.LocatorValue);
			break;

		default:
			break;
		}



	}

	public static void main(String[] args) throws Exception {

		ExcelUtilities utilities = new ExcelUtilities();
		utilities.readExcelFile(Constants.EXCEL_LOCATION);
		Engine Engine= new Engine();
		
		for (int row =1; row <= utilities.TotalRows; row++) {
			//Keyword= utilities.getLocatorActionDatafromExcel(row, locator, Action, Data);
			utilities.getLocatorActionDatafromExcel(row, Constants.lOCATOR_COLUMN, Constants.ACTION_COLUMN, Constants.DATA_COLUMN);
			Engine.getKeywordsFromActions();
			Engine.findWebElementsToBeUsed();
			Engine.executeKeywords();
			/*
			if(Keyword.equalsIgnoreCase("openBrowser")) {
				ActionKeywords.openBrowser();

			}else if(Keyword.equalsIgnoreCase("goToURL"))
			{
				ActionKeywords.goToURL();
			}
			else if(Keyword.equalsIgnoreCase("enterUsername"))
			{ActionKeywords.enterUsername();

			}
			else if(Keyword.equalsIgnoreCase("EnterPassword")) {

				ActionKeywords.enterPassword();

			}
			else if(Keyword.equalsIgnoreCase("clickLogin")) {

				ActionKeywords.clickLogin();
			}
			else if(Keyword.equalsIgnoreCase("clickDirectory"))
			{ActionKeywords.clickDirectory();

			}
			else if(Keyword.equalsIgnoreCase("selectQALead")) {

				ActionKeywords.selectQALead();

			}
			else if(Keyword.equalsIgnoreCase("clickSearch")) {

				ActionKeywords.clickSearch();
			}
	*/

}}}
