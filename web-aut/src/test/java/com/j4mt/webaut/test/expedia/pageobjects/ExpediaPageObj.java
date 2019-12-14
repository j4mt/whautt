package com.j4mt.webaut.test.expedia.pageobjects;

import org.openqa.selenium.By;

public class ExpediaPageObj {

    public static String URL = "https://www.expedia.com/";

    private By flights = new By.ByXPath("//*[@id=\"tab-flight-tab-hp\" ]/span[contains(text(),'Flights')]");

    private By fromCityAirport = new By.ByCssSelector("#flight-origin-hp-flight");

    private By toCityAirport = new By.ByCssSelector("#flight-destination-hp-flight");

    public void selectTravelDates(String fromDate,String toDate){

    }

    public void selectTravelers(int adults, int children, int infants){

    }

}
