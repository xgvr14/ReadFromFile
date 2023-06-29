import java.io.*;
import java.util.*;
import java.util.Scanner;
public class ReadFromFile {
    public void textReader() throws FileNotFoundException {

        ArrayList<String> cuvinteDinFisier = new ArrayList<String>();
        String inputTextFileName;
        Scanner inputt = new Scanner(System.in);
        System.out.println("introduce the file name again to read the text inside");
        inputTextFileName = inputt.nextLine();

       try
       { File file = new File(inputTextFileName);
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
        if (scan.next() instanceof String) {
            System.out.println(scan.next());
        } else System.out.println("Aici avem numar");
        }}
        catch(FileNotFoundException file)
           {
               System.out.println("Input file was not found, try again ");
           }
       /* finally{
               try {
                          scan.close();


               }
               catch(NullPointerException e)
               {
                   System.out.println("Null pointer exception has occured");
               }
}*/
    }}
