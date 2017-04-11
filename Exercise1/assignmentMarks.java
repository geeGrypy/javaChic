/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
/**
 *
 * @author CT User
 */
public class assignmentMarks {
    
    public static void main(String [] args)
    {
        System.out.println("--welcome to Assignments System--");
        System.out.println("--Enter All your Assignment Mark--");
        System.out.println("--Then it will Display Min,Max,Average Value and Sum --");
    
        int mk[]=new int[6];
        
        String m1;
        String m2;
        String m3;
        String m4;
        String m5;
        String m6;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The marks(6):");
        m1=s.next();
        m2=s.next();
        m3=s.next();
        m4=s.next();
        m5=s.next();
        m6=s.next();
        
        //converting to integer
        mk[0]=Integer.parseInt(m1);
        mk[1]=Integer.parseInt(m2);
        mk[2]=Integer.parseInt(m3);
        mk[3]=Integer.parseInt(m4);
        mk[4]=Integer.parseInt(m5);
        mk[5]=Integer.parseInt(m6);
        
        //arithmetic computations
        Arrays.sort(mk);
        System.out.println("Minimum = " + mk[0]);
        System.out.println("Maximum = " + mk[mk.length-1]);
        
        //to get the average and sum totals
        int sum = IntStream.of(mk).sum();
        System.out.println("The sum is " + sum);
        
        double avg=sum/6;
        System.out.println("The Average is " + avg);
        
    }
}
