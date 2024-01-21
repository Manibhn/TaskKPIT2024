import java.util.Random;

public class RocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" main Started !!!");
		Rocket MissionMangal=null;
		try {
			MissionMangal = new Rocket();
		} catch (IgnitionException e) {
System.out.println("Some Problem : "+ e.getMessage());			
		}
		
		while(true) {
			
		
		if(MissionMangal != null) {
			try {
				MissionMangal.rocketLaunch();
			}
			catch(GravityBoosterException gb) {
				System.out.println("Some Problem2 : "+ gb.getMessage());
			}
			
			
		}
		else {
			System.out.println("Rocket is not ready for Launch");
		}
		
		if(MissionMangal.level==2) {
				break;
		}
		
		
		System.out.println("========================");
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			System.out.println("sleep mai kuch problem hai ");
//		}
//		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		System.out.println("Main end..!!!");

	}

}
class IgnitionException extends Exception{

	public IgnitionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class GravityBoosterException extends RuntimeException{

	public GravityBoosterException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}


class Rocket{ 
	boolean ignitionStatus ;//= true;
	boolean gravityStatus;//= true;
	int level=1;
	
	Rocket() throws IgnitionException {
		checkIgnition();
		if(ignitionStatus) {
		System.out.println("Rocket Ignition Status is POSITIVE ");
		}
		else {
			throw new IgnitionException("Error Error Error in Ignition Test");
		}
		
	}
	void checkIgnition() {   //checked exception
	Random random= new Random();
	ignitionStatus= random.nextBoolean();
	}
	
	void CheckGravity() {   // unchecked Exception
		Random random= new Random();
			gravityStatus= random.nextBoolean();
	
	}
	
	void rocketLaunch() {
		for(int i=1; i<=2; i++) {
			
			CheckGravity();
			if(gravityStatus == false) {
				throw new GravityBoosterException("Gravity booster Exception occur..!!!");
			}
			System.out.println("Level : "+ i + " cross succesfully");
			level=i;
		}
		System.out.println("Rocket launching Successfully");
	}
	
	
}
