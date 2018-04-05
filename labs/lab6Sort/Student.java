package lab6Pack;

public class Student implements Comparable<Object>
{
    // knows
	private String firstName, lastName;
    private int score;
    
    // constructor
    public Student()
    {
    	firstName = null;
    	lastName = null;
    	score = 0;
    	
    }
    public Student(String first, String last, int test)
    {
        firstName = first;
        lastName = last;
        score = test;
    }
    // setters and getters
    public void setFirstName(String first)
    {
    	firstName = first;
    }
    
    public void setLastName(String last)
    {
    	lastName = last;
    }
    
    public void setScore(int test)
    {
    	score = test;
    }
    
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
 
    public int getScore()
    {
    	return score;
    }
    public String toString()
    {
        return lastName + ", " + firstName + "\t" + score;
    }
    public boolean equals(Object other)
    {
        return (score == ((Student)other).score);
    }
    public int compareTo(Object other)
    {

        if (score > ((Student)other).score)
            return 1;
        else if (score == ((Student)other).score)
        	return 0;
        else
        	return -1;
    }
    

}
    
        