package lab1Pack;

import java.text.NumberFormat;

public abstract class Insurance {

    protected String nameInsured;
    protected double commission;
    protected NumberFormat fmt;
    
    // default constructor
    public Insurance()
    {
        nameInsured = null;
        commission = 0;
        fmt = NumberFormat.getCurrencyInstance();
    }
    // overload constructor
    public Insurance(String theName)
    {
        nameInsured = theName;
        commission = 0;
        fmt = NumberFormat.getCurrencyInstance();        
    }
    
    // setters
    public void setName(String theName)
    {
        nameInsured = theName;
    }
    public void setCommission(double theCommission)
    {
        commission = theCommission;
    }
    
    // getters
    public String getName()
    {
        return nameInsured;
    }
    
    public double getCommission()
    {
        // update its value first then return
        computeCommission();
        return commission;
    }
    
    abstract public void computeCommission();

    
    
    // toString
    public String toString()
    {
        return ("Name of insured : " + nameInsured + "\nCommission : " + fmt.format(getCommission())); 
    }
    
}

