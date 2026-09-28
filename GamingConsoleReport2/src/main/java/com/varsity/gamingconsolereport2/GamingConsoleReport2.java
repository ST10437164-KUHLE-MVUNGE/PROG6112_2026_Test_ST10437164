/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.gamingconsolereport2;

/**
 *
 * @author kuhle
 */
/*
 * programming 9th edition:
 * Author: Joyce Farell
 * Title: Joyce Farrell.
 * Year: 2025
 * URL:Java-Programming-9th-Edition.pdf  
 */

public class GamingConsoleReport2
{
    public static void main(String[] args)
    {
       
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        printGamingConsoleReport(cities, consoles, sales);
        printCityTotals(cities, sales);
    }

    
    public static void printGamingConsoleReport(String[] cities, String[] consoles, int[][] sales)
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------");

        
        System.out.printf("%-20s", "");
        for (String console : consoles)
        {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        
        for (int row = 0; row < sales.length; row++)
        {
            System.out.printf("%-20s", cities[row]);
            for (int col = 0; col < sales[row].length; col++)
            {
                System.out.printf("%-10d", sales[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    
    public static void printCityTotals(String[] cities, int[][] sales)
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------");

        int highestTotal = 0;
        String highestCity = "";

        for (int row = 0; row < sales.length; row++)
        {
            int cityTotal = 0;

         
            for (int col = 0; col < sales[row].length; col++)
            {
                cityTotal += sales[row][col];
            }

            System.out.printf("%-20s%d%n", cities[row], cityTotal);

            
            if (cityTotal > highestTotal)
            {
                highestTotal = cityTotal;
                highestCity = cities[row];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + highestCity);
        System.out.println("---------------------------------------------------------");
    }
}
