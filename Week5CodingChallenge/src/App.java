
public class App {
	
	static Logger logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsteriskLogger p = new AsteriskLogger();
		SpaceLogger s = new SpaceLogger();
		
		p.log("Hello");
		p.error("Hello");
		
		s.log("Hello");
		s.error("Hello");
	}

}
