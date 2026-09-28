/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.csr_runapplication;

import java.util.Scanner;

/**
 *
 * @author kuhle
 */
import java.util.Scanner;

public class CSR_RunApplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Menu for selecting the console device type
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.println();

        int choice = input.nextInt();
        input.nextLine(); 

        String consoleType;
        switch (choice)
        {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid selection. Please run the program again and choose 1, 2 or 3.");
                input.close();
                return;
        }

        System.out.print("Enter the store: ");
        String store = input.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ": ");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();

        input.close();
    }
}
/*
 * programming 9th edition:
 * Author: Joyce Farell
 * Title: Joyce Farrell.
 * Year: 2025
 * URL:Java-Programming-9th-Edition.pdf  
 */

