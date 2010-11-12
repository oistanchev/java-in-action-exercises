package jia.exercises.basics.orlin.stanchev;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: stanchev
 * Date: Nov 9, 2010
 * Time: 4:30:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Exercise1 {
    public static void main(String[] args) {

		System.out.println("Please, Enter Your First Name: ");
		Scanner scanner = new Scanner(System.in);
		String inputFirstName = scanner.nextLine();

		System.out.println("Please, Enter Your Last Name: ");
		String inputLastName = scanner.nextLine();

		System.out.println("Please, Enter Your Age: ");
		String inputAge = scanner.nextLine();

		System.out.println("Please, Enter Your Employee Job: ");
		String inputFunction = scanner.nextLine();

		System.out.println("Please, Enter Your Salary: ");
		String inputSalary = scanner.nextLine();

		try{
		    // Create the file
		    FileWriter fstream = new FileWriter("outFile.txt", true);
		    BufferedWriter out = new BufferedWriter(fstream);
		    out.write(inputFirstName + "\t\t\t" + inputLastName + "\t\t\t" +
		    		inputAge + "\t\t\t" + inputFunction + "\t\t\t" + inputSalary + "\n");

		    out.close(); //Close the output stream
		}
		//Catch exception (if any)
		catch (Exception e){ System.err.println("Error: " + e.getMessage()); }

	}
}
