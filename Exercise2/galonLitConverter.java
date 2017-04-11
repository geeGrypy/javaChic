
package Grypy2017;
import java.util.*;
/*
@author Agrippina Mwangi
*/
public class galonLitConverter 
{
    public static void main(String args[])
    {
        String gal,lit;
        double gallon=0.0;
        double liter=0.0;
        double conv=3.78541;
        int val;
        
        //prompt the user to enter a liter value
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 to for number of gallons:");
        System.out.println("Enter 2 to for number of liters:");
        val=s.nextInt();
        if(val!=1 && val!=2)
        {
            System.out.println("This is a gallon liter converter");
        }
        else if(val==1)
        {
            System.out.println("Enter number of Gallons:");
            gal=s.next();
            gallon=Double.parseDouble(gal);
            
            //to display liters
            liter=gallon/conv;
            System.out.println(gallon +" gallons = "+liter+" liters");
        }
        else if(val==2)
        {
            System.out.println("Enter number of Liters:");
            lit=s.next();
            liter=Double.parseDouble(lit);
            gallon=liter*conv;
            System.out.println(liter+" liters = "+gallon+"gallons");
            
        }
        
        
    }
}
