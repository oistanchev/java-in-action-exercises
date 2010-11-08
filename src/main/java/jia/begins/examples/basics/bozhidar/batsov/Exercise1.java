package jia.begins.examples.basics.bozhidar.batsov;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author <a href="mailto:bozhidar@drow.bg">Bozhidar Batsov</a>
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException {
    	File employeesFile = new File ("employees.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(employeesFile,true));
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter employee first name: ");
        String name = in.next();
        
        System.out.print("Enter employee last name: ");
        String lastName = in.next();
        
        System.out.print("Enter employee age: ");
        int age=in.nextInt();
        
        System.out.print("Enter employee job: ");
        String job = in.next();
        
        System.out.print("Enter employee salary: ");
        int salary = in.nextInt();
        
        pw.println(String.format("%-15s %-15s %4d %-15s %10d", name, lastName, age, job, salary));
        pw.close();
    }
}
