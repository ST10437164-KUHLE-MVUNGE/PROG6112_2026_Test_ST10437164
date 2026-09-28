/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.gamingconsolereport;

/**
 *
 * @author kuhle
 */
public class GamingConsoleReport {


    public static void main(String[] args)
    {
        // Single-dimensional arrays for the row and column labels
        String[] cities = {"Cape Town", "Port Elizatbeth", "Johannesburg"};
        String[] consoleTypes = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: rows = cities, columns = vehicle types
        int[][] consoles = {
            {1000, 2000 ,3000 },
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        printGamingReport(cities, consoleTypes, consoles);
        printCityTotals(cities, consoles);
    }

    // Prints the table of accidents per city and vehicle type
    public static void printGamingReport(String[] cities, String[] consoleTypes, int[][] consoles)
    {
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("-------------------------------------------------------");

        // Header row
        System.out.printf("%-20s", "");
        for (String consoleType : consoleTypes)
        {
            System.out.printf("%-15s", consoleType);
        }
        System.out.println();

        // One row per city, one column per vehicle type
        for (int row = 0; row < consoles.length; row++)
        {
            System.out.printf("%-20s", cities[row]);
            for (int col = 0; col < consoles[row].length; col++)
            {
                System.out.printf("%-15d", consoles[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Calculates each city's total and finds the city with the most accidents
    public static void printCityTotals(String[] cities, int[][] accidents)
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------------");

        int highestTotal = 0;
        String highestCity = "";

        for (int row = 0; row < consoles.length; row++)
        {
            int cityTotal = 0;

            // Add up every vehicle type for this city
            for (int col = 0; col < consoles[row].length; col++)
            {
                cityTotal += consoles[row][col];
            }

            System.out.printf("%-20s%d%n", cities[row], cityTotal);

            // Remember the city with the largest total so far
            if (cityTotal > highestTotal)
            {
                highestTotal = cityTotal;
                highestCity = cities[row];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + highestCity);
        System.out.println("-------------------------------------------------------");
    }
}
