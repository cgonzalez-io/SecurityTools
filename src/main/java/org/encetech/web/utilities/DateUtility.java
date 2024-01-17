package org.encetech.web.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateUtility {
  //input variables
  protected String inputDate = " ";
  protected ArrayList<String> inputDateList = new ArrayList<String>();
  //output variables
  private Date outputDate;
  private String outputStringDate;
  private ArrayList<Date> outputDateList = new ArrayList<Date>();
  //Pattern for date and date time
  private final String DATE_PATTERN = "yyyy-MM-dd";
  private final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss Z";
  private final String TIME_PATTERN = "h:mm a";
  //decision element
  private Boolean isDate;

  //getters and setters

  public String getInputDate() {
    return inputDate;
  }

  public void setInputDate(String inputDate) {
    this.inputDate = inputDate;
  }

  public ArrayList<String> getInputDateList() {
    return inputDateList;
  }

  public void setInputDateList(ArrayList<String> inputDateList) {
    this.inputDateList = inputDateList;
  }

  public DateUtility(String inputDate) throws ParseException {
    SimpleDateFormat date = new SimpleDateFormat(DATE_PATTERN);
    outputDate = date.parse(inputDate);
  }

  public DateUtility(ArrayList<String> inputDateList) throws ParseException {
    SimpleDateFormat date = new SimpleDateFormat(DATE_PATTERN);
    for (String inputDate : inputDateList) {
      outputDateList.add(date.parse(inputDate));
    }
  }

  public DateUtility(String inputDate, Boolean isDate) throws ParseException {
    SimpleDateFormat date;
    if (isDate) {
      date = new SimpleDateFormat(DATE_PATTERN);
    } else {
      date = new SimpleDateFormat(TIME_PATTERN);
    }
    outputDate = date.parse(inputDate);
  }

  public DateUtility(ArrayList<String> inputDateList, Boolean isDate)
    throws ParseException {
    SimpleDateFormat date;
    if (isDate) {
      date = new SimpleDateFormat(DATE_PATTERN);
    } else {
      date = new SimpleDateFormat(TIME_PATTERN);
    }
    for (String inputDate : inputDateList) {
      outputDateList.add(date.parse(inputDate));
    }
  }

  public int getDay() {
    return outputDate.getDay();
  }

  public int getMonth() {
    return outputDate.getMonth();
  }

  public int getYear() {
    return outputDate.getYear();
  }

  public int getHour() {
    return outputDate.getHours();
  }

  public int getMinute() {
    return outputDate.getMinutes();
  }

  public int getSecond() {
    return outputDate.getSeconds();
  }

  public Date getDate() {
    return outputDate;
  }
}
