
// Java Program to Demonstrate FileInputStream Class 

// Importing I/O classes 
import java.io.*; 

// Main class 
// ReadFile 
class fileinputstream { 

	// Main driver method 
	public static void main(String args[]) throws IOException 
	{ 

		// Attaching the file to FileInputStream 
		FileInputStream fin = new FileInputStream("C:\\Users\\HP\\Desktop\\java project\\tmkoc.txt"); 

		// Illustrating getChannel() method 
		System.out.println(fin.getChannel()); 

		// Illustrating getFD() method 
		System.out.println(fin.getFD()); 

		// Illustrating available method 
		System.out.println("Number of remaining bytes:"+ fin.available()); 

		// Illustrating skip() method 
		fin.skip(4); 

		// Display message for better readability 
		System.out.println("FileContents :"); 

		// Reading characters from FileInputStream 
		// and write them 
		int ch; 

		// Holds true till there is data inside file 
		while ((ch = fin.read()) != -1) 
			System.out.print((char)ch); 

		// Close the file connections 
		// using close() method 
		fin.close(); 
	} 
}
