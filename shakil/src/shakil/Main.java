package shakil;

public class Main {
    public static void  main(String[] args) 
    {
    	Car Auddi=new Car();
    	Ship Titanic=new Ship();
    	Auddi.setSpeed(100);
    	Auddi.setRunningState(true);
    	System.out.println("The car speed is "+Auddi.speed());
    	if(Auddi.isrunning())
    	{
    		System.out.println("The is running");
    	}
    	else
    	{
    		System.out.println("The is not running");
    	}
    	doSomething(Auddi);
    	System.out.println("The car speed is "+Auddi.speed());
    	doSomething(Titanic);
    }
    public static void doSomething(Vehicle vehicle)
    {
    	if(vehicle instanceof Car)
    	{
    		((Car)vehicle).accelerate(50);
    		((Car)vehicle).breakToStop();
    	}
    	else
    	{
    		System.out.println("This is not a Car");
    	}
    }
}

