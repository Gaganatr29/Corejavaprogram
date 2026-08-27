package Com.tnsif.abstractionmethod;
abstract class sunf{
	abstract void Sunlight(String message);
}

class SunlightService extends sunf{

	@Override
	void Sunlight(String message) {
		// TODO Auto-generated method stub
		String source = "sun";
		System.out.println("Receiving sunlight...");
		System.out.println("Source : "+source);
		System.out.println("Message : "+message);
		int messageLength = message.length();
		System.out.println("Message length:"+ messageLength);
	}
	
}
public class Sunlight {
	public static void main(String[] args) {
		SunlightService s = new SunlightService();
		s.Sunlight("Sunlight is important for life");
		}
	}
