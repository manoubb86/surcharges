package ci.objis.surcharge;

public class CalculatriceDrive {
    /**
     * 
     * @param args
     */
	
	
	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
     System.out.println(c.addition(4, 7));
	 System.out.println(c.addition(4.5f, 7.3f));	
	 System.out.println(c.addition(4, 7.5f));
	 System.out.println(c.addition(8.5f, 4));
	 
	}

}