/*
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. 

Task 
	Given an integer, n, perform the following conditional actions:
	If n is odd, print Weird
	If n is even and in the inclusive range of 2 to 5, print Not Weird
	If n is even and in the inclusive range of 6 to 20, print Weird
	If n is even and greater than 20, print Not Weird
	
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format:
	A single line containing a positive integer, n.
	
Constraints:
	1 <= n <= 100
	
Output Format:
	Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0:
	3
	
Sample Output 0:
	Weird
	
Sample Input 1:
	24
Sample Output 1:
	Not Weird

Explanation

Sample Case 0: n == 3 
	n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n == 24
	n > and n is even, so it isn't weird. Thus, we print Not Weird.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ShortAnswer();
    }
    
    private static void Answer(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2 == 1){
            System.out.println("Weird");
        }
        else if(n>=2 && n<=5){
            System.out.println("Not Weird");
        }
        else if(n>=6 && n<=20){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
    }
    
    private static void ShortAnswer(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2 == 1 || (n>=6 && n<=20) ){
            System.out.println("Weird");
        }
        else if(n>=2 && n<=5 || (n>20)){
            System.out.println("Not Weird");
        }
    }

}




