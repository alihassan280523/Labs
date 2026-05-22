import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        FileWriter fr = new FileWriter("Student.txt",true);
        BufferedWriter br = new BufferedWriter(fr);

        String id;
        String name;
        int option;
        String ch;

        Scanner sc = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        // sc.remove();
        
        do {

            System.out.print("Enter -1 if you wish to exit: ");

            option = sc.nextInt();
            
            if (option != -1) {
                System.out.print("\nEnter Id: ");
                id = stringInput.nextLine();
                br.write(id + " ");
                System.out.println("\nEnter your name: ");
                name = stringInput.nextLine();
                br.write(name);
                br.newLine();

            }
        } while (option != -1);

        br.close();
        fr.close();
    }
}