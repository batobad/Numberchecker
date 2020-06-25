/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bah.numberchecker2;

import java.util.Scanner;

/**
 *
 * @author Mister BAH
 */
public class Menu 
{
   
    public Menu(){}
    
    public void menu()
    {
        int option;
        Scanner sc = new Scanner(System.in);	

        System.out.println("---------Menu---------");
        System.out.println("1. Check Odd or Even");
        System.out.println("2. Exit");
        System.out.print("\nChoose the option: ");
                
        option = sc.nextInt();
	
	// Switch Case
        
        switch(option)
        {
            case 1:  OddOrEven.checkOddOrEven();
                    break;
            case 2: exit();
                    break;
            default: System.out.println("Incorrect menu option");
                     menu();
                    break;
       }
    }
    
     // Methods definition
    public void checkOddOrEven() 
    {
	OddOrEven obj = new OddOrEven();
        obj.checkOddOrEven();
    }

     public void exit() 
    {
        System.exit(0);
    }
     
    public static void main(String[] args)
    {
      Menu obj = new Menu();
      obj.menu();
    }
    
}
