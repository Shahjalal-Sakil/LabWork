package shakil;

public class Helicopter extends Air{
	 public void accelerate(int speed)
	   {
		   vehicleSpeed=vehicleSpeed+speed;
	   }
	   public void changeLandingState()
	   {
		   if(running==true)
			   running=false;
		   else
			   running=true;
	   }
	   public void land()
	   {
		   running=false;
		   vehicleSpeed=0;
	   }
}
