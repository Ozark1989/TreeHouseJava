package TreeHouse;

public class Example {
	
	 public static void main(String[] args) {

		    System.out.println("We are making a new PEZ Dispenser");
		    
		    System.out.printf("Fun Fact: There are %d PEZ allowed in every dispenser %n",
		    		PezDispenser.MAX_PEZ);
		    
		    PezDispenser dispenser = new PezDispenser("Yoda");
		    
		    System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
		                      
		    System.out.println("Filling the dispenser with delicious PEZ...");
		    dispenser.fill();
		        
		    if (dispenser.isEmpty()) {
		      System.out.println("Dispenser is empty");
		    }
		    
		    if (!dispenser.isEmpty()) {
		      System.out.println("Dispenser is full");
		    }
		    
		    while (dispenser.dispense()) {
		      System.out.println("Chomp!");
		    }
		    
		    if (dispenser.isEmpty()) {
		     System.out.println("Ate all the PEZ");
		    }
		    
		    dispenser.fill(4);
		    dispenser.fill(2);
		    
		    while (dispenser.dispense()) {
		      System.out.println("Chomp!!");
		    }
		    
		    try{
		      dispenser.fill(400);
		      System.out.println("This will never happen!!");
		    } catch (IllegalArgumentException iae) {
		      System.out.println("Whoa There!"); 
		      System.out.printf("The Error was %s %n", iae.getMessage());
		    }

	 }
}
