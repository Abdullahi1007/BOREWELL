import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);

		System.out.println("Enter length, width and height:");

	    // Numerical input
		float l = myObj.nextFloat();
	    float w = myObj.nextFloat();
	    float h = myObj.nextFloat();

	    // Output input by user
	    System.out.println("Length: " + l); 
	    System.out.println("Width: " + w); 
	    System.out.println("height: " + h); 
	  

	Room room = new Room(l, w, h);
	room.printRoom();
	}
		  
	}


