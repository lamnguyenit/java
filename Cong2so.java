/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cong2so;

import java.util.Scanner;

/**
 *
 * @author LamIT
 */
public class Cong2so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tong=0;
        System.out.println("nhap a:");
        Scanner na=new Scanner(System.in);
        int a=na.nextInt();
        System.out.println("nhap b:");
        Scanner nb=new Scanner(System.in);
        int b=nb.nextInt();
        tong=a+b;
        System.out.println("tong a+b la:"+tong);
        
    }
    
}
