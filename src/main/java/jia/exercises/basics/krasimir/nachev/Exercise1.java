package jia.exercises.basics.krasimir.nachev;

/**
 * Created by IntelliJ IDEA.
 * User: krasi
 * Date: Nov 8, 2010
 * Time: 10:13:08 AM
 * To change this template use File | Settings | File Templates.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

class OsParameters {
    public String getOs() {
      String osName;
      osName  = System.getProperty("os.name");
      return osName;

    }

    public String getUserName() {
       String userName;
       userName = System.getProperty("user.name");
       return userName;
    }

    public String getOsVersion() {
        String osVersion = System.getProperty("os.version");
        return osVersion;
    }

}

class UserQuesitions {


    String ask = "What is your";
    public void askFirstName() {
     System.out.print( ask + " " + "First name:");
    }
    public void askSurName() {
     System.out.print( ask + " "+ "Surname:");
    }
    public void askJobPosition() {
    System.out.print(ask + " " + "Office position:");
    }
    public void askSalary() {
     System.out.print(ask + " " + "Salary:");
    }
}


public class Exercise1 {
    public static void main(String args[]) throws FileNotFoundException, IOException  {
      OsParameters osSystemInfo = new OsParameters();
      UserQuesitions userInfo = new UserQuesitions();

      Scanner readIn = new Scanner(System.in);
      String fileName = "jacmeInfoSalary.txt";
      File jacmeInfoSalary = new File(fileName);
      // Get date
      Date date =new java.util.Date();

     //File Exist by default
      boolean FileExist = true;
      PrintWriter pw = null;
      // check if file exist
      if (FileExist) {
          pw = new PrintWriter(new FileWriter(jacmeInfoSalary,true));

        } else {
          pw = new PrintWriter(new FileWriter(jacmeInfoSalary));

        }

       userInfo.askFirstName();
       String firstName = readIn.nextLine();


       userInfo.askSurName();
       String lastName = readIn.nextLine();

       userInfo.askJobPosition();
       String jobPosition = readIn.nextLine();

       userInfo.askSalary();
       double salary = readIn.nextDouble();
        pw.write(String.format("\n First Name: " + firstName + "\t Last Name: " + lastName + "\t Job Position: " + jobPosition + "\t Salary: " + salary + " " + "lv." + " " ));
         pw.write(String.format("The record was created on: " + date + " " +" From user: " + osSystemInfo.getUserName() + " " + "and OS: " + osSystemInfo.getOs() + " " + osSystemInfo.getOsVersion()));


          pw.flush();
          pw.close();


           }
    
}
