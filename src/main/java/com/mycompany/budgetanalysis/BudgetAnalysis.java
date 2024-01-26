/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.budgetanalysis;
import java.util.Scanner;

/**
 *
 * @author tatianaeng
 */
public class BudgetAnalysis
{

    public static void main(String[] args)
    {
        // variables
        double monthlyBudget;
        int anotherExpense;
        double expenseAmount;
        double totalExpenses = 0;
        
        // create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for the amount they've budgeted for the month
        System.out.println("Hi, Tatiana Eng! What is your budget for the month? (Just the numeric value, no $.)");
        
        // read user input
        monthlyBudget = keyboard.nextDouble();
        
        // ask user if they have an expense to record
        System.out.println("Do you have an expense to record? Enter 1 for yes or 0 for no.");
        
        // read user input
        anotherExpense = keyboard.nextInt();
        
        // while loop to ask the user to enter each of their expenses for the month and keep a running total
        while (anotherExpense == 1)
        {
            
            // ask user for expense amount
            System.out.println("Enter the expense amount. (Just the numeric value, no $.)");
            
            // read user input
            expenseAmount = keyboard.nextDouble();
            
            // keep a running total
            totalExpenses = totalExpenses + expenseAmount;
            
            // ask user if they have another expense to record
            System.out.println("Do you have another expense to record? Enter 1 for yes or 0 for no.");
        
            // read user input
            anotherExpense = keyboard.nextInt();
            
        }
        
        // calculate the amount that the user is over/under budget and display the result
        System.out.printf("Total expenses: $%,.2f\n", totalExpenses);
        
        if (totalExpenses > monthlyBudget)
            System.out.printf("You overspent by $%,.2f.",totalExpenses - monthlyBudget);
        else if (monthlyBudget > totalExpenses)
            System.out.printf("You were $%,.2f under budget! Nice job!", monthlyBudget - totalExpenses);
    }
}

/*

Write a program that asks the user to enter the amount that he/she has budgeted for a month.
A loop should then prompt the user to enter each of his/her expenses for the month and keep a running total.
When the loop finishes, the program should display the amount that the user is over or under budget.

*/