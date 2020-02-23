package CopyFile;

import java.io.File;
import java.util.Scanner;

public class copyFile {

    public static void main(String[] args) {
        boolean found = false;
        while(found == false){
        try {
            System.out.print("Enter the file name: ");

            Scanner input = new Scanner(System.in);

            File file = new File("C:\\Users\\dewan\\OneDrive\\Documents\\NetBeansProjects\\APPL1_Week2\\src\\CopyFile\\" + input.nextLine());

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            found = true;

        } catch (Exception ex) {
            System.out.println("Current file does not exist.");
        }
        }
    }

}