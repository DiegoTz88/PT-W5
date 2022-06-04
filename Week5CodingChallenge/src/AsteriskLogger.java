public class AsteriskLogger implements Logger {
	
	String symbol = "*";
	
	

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***" );
	}

	@Override
	public void error(String error) {
		System.out.println("******************\n" + "***Error: " + error + "***\n" +"******************");
	}


}
