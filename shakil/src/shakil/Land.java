package shakil;

public class Land implements Vehicle {
    public int vehicleSpeed; 
    boolean running;
	public int speed()
     {
    	 return vehicleSpeed;
    	 
     }
	public boolean isrunning()
	{
	   return running;
	}
	
	public void setSpeed(int speed)
	{
	   this.vehicleSpeed=speed;
	}
	public void setRunningState(boolean state)
	{
		this.running=state;
	}
}
