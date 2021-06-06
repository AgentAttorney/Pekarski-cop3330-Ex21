package Ex21;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example21 {
    public static void main(String[] args)
    {
        String [] calendar = new String[]{"January", "February", "March"
                , "April", "May", "June", "July", "August"
                , "September", "October", "November", "December"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 12 ");
        int index_num = input.nextInt() - 1; // correspond to array index
        int switch_case = 1;
        String corr_month;
        switch(switch_case)
        {
            case 1:
                corr_month = calendar[index_num];
                break;
            default:
                corr_month = calendar[index_num];
                break;
        }
        System.out.print("The name of the month is " + corr_month + ".");
    }
}
