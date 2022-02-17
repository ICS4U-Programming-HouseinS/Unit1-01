import java.util.Scanner;

class Main {
	  public static void main(String[] args) {
		      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		      System.out.println("Enter log length");
		      String logLengthString = myObj.nextLine();
		      double logLengthDouble = Double.parseDouble(logLengthString);
		      double logWeight = logLengthDouble * 20;
		      double truckLogs = 1100/logWeight;
		      System.out.println(truckLogs + " can fit on the truck");
				    }
}
