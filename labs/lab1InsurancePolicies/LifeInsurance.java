

package lab1Pack;

public class LifeInsurance extends Insurance {
    private int age;
    private double life;
    private final double PERCENT = 0.2;

    public LifeInsurance()
    {
        super();
        age = 0;
        life = 0;
    }
    
    public LifeInsurance(String theName, int theAge, double theLife)
    {
        super(theName);
        age = theAge;
        life = theLife;
        commission = life * PERCENT;
    }
    
    // setters
    public void setAge(int theAge)
    {
        age = theAge;
    }
    public void setLife(double theLife)
    {
        life = theLife;
    }
    
    // getters
    public int getAge()
    {
        return age;
    }
    public double getLife()
    {
        return life;
    }
    
    private void computeCommission()
    {
        commission = life * PERCENT;
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
        return ("Name of insured : " + nameInsured + "\nAge : "+ age +"\nLife coverage : " + fmt.format(life) + "\nCommission : " + fmt.format(commission));
    }

}

