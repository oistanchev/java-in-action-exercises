package jia.begins.examples.basics.nikolay.yanev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);

	System.out.println("Insert employee first name: ");
	String firstName = scan.next();

	System.out.println("Insert employee last name: ");
	String lastName = scan.next();

	System.out.println("Insert employee age: ");
	int age = scan.nextInt();

	System.out.println("Insert employee position: ");
	String position = scan.next();

	System.out.println("Insert employee salary: ");
	double salary = scan.nextDouble();

	// Open our database
	File db = new File("employees.txt");
	if (!db.exists()) {
	    db.createNewFile();
	}

	PrintWriter dataBase = new PrintWriter(new FileWriter(db, true));

	dataBase.write(String.format("%-15s  %-15s  %-2d  %-15s  %6.2f%n",
		firstName, lastName, age, position, salary));
	
	dataBase.flush();

    }
}