package assignments;

public class App {
	static Logger Logger;
	public static void main(String[] args) {
		
		Logger loggerA = new AsterikLogger();
		Logger loggerS = new SpacedLogger();
		
		loggerA.log("Hello");
		loggerA.error("Warning!");
		
		loggerS.log("Warning!");
		loggerS.error("Warning!");
		
	}

}
