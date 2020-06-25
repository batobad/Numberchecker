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
public class OddOrEven 
{
    public OddOrEven(){}
    public static void checkOddOrEven() 
    {
       int x;
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 2 == 0 )
      {
          System.out.println("The number entered is an even number.");
      }
      
      else
      {
          System.out.println("The number entered is an odd number."); 
      }
      
    }
    
}
