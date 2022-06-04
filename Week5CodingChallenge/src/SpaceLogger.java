public class SpaceLogger implements Logger {


		

	@Override
	public void log(String log) {
		System.out.println(log.replace("", " ") );
		
	}

	@Override
	public void error(String error) {
		System.out.println("Error:" + error.replace("", " "));
	}


}
