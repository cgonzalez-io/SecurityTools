package org.encetech.web.utilities;

import java.text.ParseException;
import java.util.Date;

public class DateCalculator {
  protected String inputStringDate1;
  protected String inputStringDate2;
  private Date inputDate1;
  private Date inputDate2;

  public String getInputStringDate1() {
    return inputStringDate1;
  }

  public void setInputStringDate1(String inputStringDate1) {
    this.inputStringDate1 = inputStringDate1;
  }

  public String getInputStringDate2() {
    return inputStringDate2;
  }

  public void setInputStringDate2(String inputStringDate2) {
    this.inputStringDate2 = inputStringDate2;
  }

  public DateCalculator(String inputStringDate1, String inputStringDate2)
    throws ParseException {
    DateUtility date1 = new DateUtility(inputStringDate1);
    DateUtility date2 = new DateUtility(inputStringDate2);
    this.inputDate1 = date1.getDate();
    this.inputDate2 = date2.getDate();
  }

  public int getDaysBetween() {
    return this.getDaysBetween(inputDate1, inputDate2);
  }

  private int getDaysBetween(Date date1, Date date2) {
    long difference = date1.getTime() - date2.getTime();
    return (int) (difference / (1000 * 60 * 60 * 24));
  }
}
