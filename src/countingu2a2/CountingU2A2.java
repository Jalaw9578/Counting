/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countingu2a2;

/**
 *
 * @author Jalaw9578
 */
import java.util.Scanner;
public class CountingU2A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedinput = new Scanner(System.in);
        System.out.println("Please enter your choice:\n" +
            "\n" +
            "1... Count from 0 to 10 by 1\n" +
            "2... Count from 100 to 0 by 10\n" +
            "3... Count from 50 to 500 by 50\n" +
            "4... Count from 6000 to 1000 by 1000");
        System.out.print("whats your choice? :");
        int input = keyedinput.nextInt();
        
        switch(input){
            case 1:
            for (int i=0;i<=10;i++){
                System.out.println(i);
            }
            break;
            case 2:
            for (int i=0;i<=100;i+=10){
                System.out.println(i);
            }        
            break;
            case 3:
            for (int i=0;i<=500;i+=50){
                System.out.println(i);
            }        
            break;
            case 4:
            for (int i=0;i<=6000;i+=1000){
                System.out.println(i);
            }        
            break;
        }
        }
    }
    

