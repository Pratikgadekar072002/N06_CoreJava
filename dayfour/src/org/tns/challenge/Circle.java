/* // There are n people tsnading in a circle waiting to be executed. 
 * The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. 
 * In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle 
 * (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom. 
 * Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle. 
 * The task is to choose the place in the initial circle so that you are the last one remaining and so survive.*/
package org.tns.challenge;

import java.util.Scanner;

public class Circle {
    public static int circle(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (circle(n - 1, k) + k - 1) % n + 1;
        }
    }
    public static void main(String[] args) {    
    							
    	System.out.println("Enter the n and k value");
    	Scanner s =new Scanner(System.in);
    	int n=s.nextInt();
    	int k=s.nextInt();
        //int n =11;
        //int k = 3;
        System.out.println("The chosen place is " + circle(n, k));
    }
}
