package shakil;

public class Boat extends Water{
	 public void accelerate(int speed)
	   {
		   vehicleSpeed=vehicleSpeed+speed;
	   }
	   public void changeAnchorState()
	   {
		   if(running==true)
			   running=false;
		   else
			   running=true;
	   }
	   public void Anchor()
	   {
		   running=false;
		   vehicleSpeed=0;
	   }
}
