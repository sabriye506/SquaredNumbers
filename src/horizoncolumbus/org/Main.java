package horizoncolumbus.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> nm = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        // having trouble using for each to store input into arraylist
        int numbers [] = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Enter number %s", i + 1);
            numbers[i] = input.nextInt();
        }
        // I think i did this wrong too
        for(int number : numbers){
            int squaredNumber = number * number;
            System.out.println(squaredNumber);
        }
    }
}
