
// compute total yearly cost of college
//dorm or commuting -> if dorm -> duration of stay, weekle expenses,
//all students

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String inputFileName;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the file name? ");
        inputFileName = input.nextLine();
        Scanner inputFile = null;
        double total = 0;
        int count =0 ;

        try {

            inputFile = new Scanner(new File(inputFileName));

            while (inputFile.hasNextDouble()) {

                total = total + inputFile.nextDouble();

                count++;

                System.out.println();          }
            System.out.println("The average is " + total / count);

            }

        catch(FileNotFoundException file)
            {
                System.out.println("Input file was not found, try again ");
            }
        finally{
                try {

                    inputFile.close();

                }
                catch(NullPointerException e)
                {
                System.out.println("Null pointer exception has occured");
            }
        }
        //de revenit, n-am reusit sa implementez verificarea de string/double
        ReadFromFile x = new ReadFromFile();
        x.textReader();
    }



}