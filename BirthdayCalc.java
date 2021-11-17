/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package birthday;

import java.time.LocalDate;

/**
 *
 * @author MN_AL
 */
public class BirthdayCalc {
    
    LocalDate LD= LocalDate.now();
    
    private int Year;
    private int Month;
    private int Day;

    public int getYear() {
      
        Year = LD.getYear()-Year;
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMonth() {
      
        if(LD.getMonthValue()>Month){
        
             Month = LD.getMonthValue()-Month;
        }
        if(Month>LD.getMonthValue())
        {
            Month= Month-LD.getMonthValue();
        }
        
         
        return Month;
    }

    public void setMonth(int Month) 
    {
        
        this.Month = Month;
    }

    public int getDay() {
        
        if(LD.getDayOfMonth()>Day)
        {
            Day =  LD.getDayOfMonth()-Day;
        }
        if(Day> LD.getDayOfMonth())
        {
            Day= Day-LD.getDayOfMonth();
        }
        
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }
    
}
