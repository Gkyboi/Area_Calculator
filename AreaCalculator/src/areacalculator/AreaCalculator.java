/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculator;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class AreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("Enter username:");
        String uname = login.nextLine();
        System.out.println("Enter password:");
        String pass = login.nextLine();
        /*
        String reg_user = "sermet";
        String reg_pass = "1234";
        */
        HashMap<String, String> reg_user_info = new HashMap<String, String>();
        reg_user_info.put("sermet", "1234");
        reg_user_info.put("ahmet", "123");
        reg_user_info.put("ayse","321");
        int choice;
        if(reg_user_info.get(uname).equals(pass)){
            System.out.println("Welcome " + pass);
            System.out.println("For calculating the area of a triangle press 1,");
            System.out.println("For calculating the area of a rectangle press 2.");
            choice = login.nextInt();
            if(choice == 1){
                System.out.println("Please enter first value:");
                int kenar1 = login.nextInt();
                System.out.println("Please enter second value:");
                int kenar2 = login.nextInt();
                Triangle tri = new Triangle(kenar1,kenar2);
                tri.calculateArea();
            }
            else if (choice == 2){
                System.out.println("Please enter first value:");
                int kenar1 = login.nextInt();
                System.out.println("Please enter second value:");
                int kenar2 = login.nextInt();
                Rectangle rec = new Rectangle(kenar1,kenar2);
                rec.calculateArea();
            }
        }
        else {
            System.out.println("You entered your information incorrectly.");
                    
        }
        /*
        if(reg_user.equals(uname) && reg_pass.equals(pass)){
            System.out.println("Welcome " + pass);
            System.out.println("For calculating the area of a triangle press 1,");
            System.out.println("For calculating the area of a rectangle press 2.");
            choice = login.nextInt();
            if(choice == 1){
                System.out.println("Please enter first value:");
                int kenar1 = login.nextInt();
                System.out.println("Please enter second value:");
                int kenar2 = login.nextInt();
                Triangle tri = new Triangle(kenar1,kenar2);
                tri.calculateArea();
            }
            else if (choice == 2){
                System.out.println("Please enter first value:");
                int kenar1 = login.nextInt();
                System.out.println("Please enter second value:");
                int kenar2 = login.nextInt();
                Rectangle rec = new Rectangle(kenar1,kenar2);
                rec.calculateArea();
            }
        }
        else {
            System.out.println("You entered your information incorrectly.");
        }
    }
    */
    
    }
}
