/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import java.util.Scanner;
/**
 *
 * @author CT User
 */
public class convertSpeed {
       
       
    public static void main (String [] args)
    {
        String choice,x,y;
        int Num;
        double mph=0;
        double kmh=0;
        
        Scanner s=new Scanner(System.in);
        //set a welcome banner
        System.out.println("----Welcome to Converting Speed Application----");
        System.out.println("----You Can Choose to Convert Kilometres per hour(KMH) to Miles per hour (MPH)");
        System.out.println("----OR Convert Miles per hour to Kilometres per hour ----");
        
        //request for inputs
        System.out.println("Enter 1 for KMH to MPH");
        System.out.println("Enter 2 for MPH to KMH");
        System.out.println("Any number than 1 and 2 to Exit.");
        choice=s.next();
        Num=Integer.parseInt(choice);
        
        //convert the speeds
        if(Num!=1 && Num!=2)
        {
            System.out.println("Thank you and Have a Nice Day");
        }
        else
        {
            System.out.println("Your Number of Choice:"+choice);
            
            
            //do the speed conversions according to the choices made
            if(Num==1)
            {
                System.out.println("Enter a speed in KMH:"); 
                x=s.next();
                kmh=Double.parseDouble(x);
                //convert from KMH to MPH
                mph=kmh*0.6214;
                System.out.println(kmh+" KMH is "+mph+" MPH");
            }
            else 
            { 
                System.out.println("Enter a speed in MPH:"); 
                y=s.next();
                mph=Double.parseDouble(y);
                kmh=mph/0.6214;
                System.out.println(mph+" MPH is "+kmh+" KMH");
                //convert from MPH to KMH
                
            }
        }
        
    }
}
