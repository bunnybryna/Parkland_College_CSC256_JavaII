package lab1Pack;

public class PolicyTest {

	public static void main(String[] args) {
		Insurance i1 = new Insurance();
        System.out.println(i1);
        Insurance i2 = new Insurance("Wire");
        System.out.println(i2);
        System.out.println(i2.getCommission());
        System.out.println("---------------------");
        
        AutoInsurance ai = new AutoInsurance("Jimmy McNulty", "2012 Honda Civic", 1000, 500 );
        System.out.println(ai);
        System.out.println(ai.getCommission());
        System.out.println("---------------------");
        
        HomeInsurance hi = new HomeInsurance("Omar Little", 1500, 20000, 10000, 30000);
        System.out.println(hi);
        System.out.println(hi.getCommission());
        System.out.println("---------------------");

        LifeInsurance li = new LifeInsurance("Avon Barksdale", 40, 2000000);
        System.out.println(li);
        System.out.println(li.getCommission());        
	}

}
