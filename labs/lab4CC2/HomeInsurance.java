package lab1Pack;

public class HomeInsurance extends Insurance{
    private final double PERCENT1 = 0.3;
    private final double PERCENT2 = 0.2;
    private double footage;
    private double dwelling;
    private double contents;
    private double liability;

    public HomeInsurance()
    {
        super();
        footage = 0;
        dwelling = 0;
        contents = 0;
        liability = 0;
    }
    
    public HomeInsurance(String theName, double theFootage, double theDwelling, double theContents, double theLiability)
    {
        super(theName);
        footage = theFootage;
        dwelling = theDwelling;
        contents = theContents;
        liability = theLiability;
        commission = (liability * PERCENT1) + ( (dwelling + contents) * PERCENT2);
    }
    // setters
    public void setFootage(double theFootage)
    {
        footage = theFootage;   
    }    
    public void setDwelling(double theDwelling)
    {
        dwelling = theDwelling;
    }
    public void setContents(double theContents)
    {
        contents = theContents;
    }
    public void setLiability(double theLiability)
    {
        liability = theLiability;
    }
    
    // getters
    public double getFootage()
    {
        return footage;
    }
    public double getDwelling()
    {
        return dwelling;
    }
    public double getContents()
    {
        return contents;
    }
    public double getLiability()
    {
        return liability;
    }
    public void computeCommission()
    {
        commission = (liability * PERCENT1) + ( (dwelling + contents) * PERCENT2);
    }
    
    public double getCommission()
    {
        // update its value first then return
        computeCommission();
        return commission;
    }
    
    //toString
    public String toString()
    {
        String fromParent = super.toString();
    	return (fromParent + "\nHouse footage : " + footage + "\nDwelling coverage : " + fmt.format(dwelling) + "\nContents coverage : " + fmt.format(contents) + "\nLiability : " + fmt.format(liability));
    }
}

