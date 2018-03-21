package lab1Pack;

public class AutoInsurance extends Insurance{
    protected final double PERCENT = 0.3;
    private String makeModel;
    private double liability;
    private double collision;

    
    public AutoInsurance()
    {
    	super();
        makeModel = null;
        liability = 0;
        collision = 0;
    	
    }
    
    public AutoInsurance(String theName, String theModel, double theLiability, double theCollision)
    {
        super(theName);
        makeModel = theModel;
        liability = theLiability;
        collision = theCollision;
        // overrides parent's version
        commission = (liability + collision) * PERCENT;
    }        
    
    // setters
    public void setModel(String theModel)
    {
        makeModel = theModel;
    }
    public void setLiability(double theLiability)
    {
        liability = theLiability;
    }
    public void setCollision(double theCollision)
    {
        collision = theCollision;
    }
    
    // getters
    public String getModel()
    {
        return makeModel;
    }
    public double getLiability()
    {
        return liability;
    }
    public double getCollision()
    {
        return collision;
    }

    private void computeCommission()
    {
        commission = (liability + collision) * PERCENT;
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
        return ("Name of insured : " + nameInsured + "\nMake and Model : " + makeModel + "\nLiability coverage : " +  fmt.format(liability) + "\nCollision coverage : " + fmt.format(collision) + "\nCommission : " + fmt.format(commission));
    }
}

