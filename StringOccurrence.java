import java.io.*;
import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.print("Enter the string to search: ");
        String search = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Myfile.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                int index = 0;

                while ((index = line.indexOf(search, index)) != -1) {
                    count++;
                    index = index + search.length();
                }
            }

            br.close();

            System.out.println("Total occurrences = " + count);

        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }

        sc.close();
    }
}