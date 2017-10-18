package shakil;

public class Bus extends Land{
	 public void accelerate(int speed)
	   {
		   vehicleSpeed=vehicleSpeed+speed;
	   }
	   public void changeState()
	   {
		   if(running==true)
			   running=false;
		   else
			   running=true;
	   }
	   public void breakToStop()
	   {
		   running=false;
		   vehicleSpeed=0;
	   }
}
