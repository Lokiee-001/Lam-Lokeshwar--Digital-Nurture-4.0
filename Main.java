package SingleTon_Pattern;

public class Main {

	    public static void main(String[] args) {
	        Logger log1 = Logger.getInstance();
	        log1.log("First message");

	        Logger log2 = Logger.getInstance();
	        log2.log("Second message");

	        if (log1 == log2) {
	            System.out.println("Same instance confirmed.");
	        } else {
	            System.out.println("Different instances! Singleton failed.");
	        }
	    }
	}
