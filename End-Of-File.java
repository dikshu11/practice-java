/*Read some unknown  lines of user until you reach EOF;
 each line of input contains a non-empty String.
For each line, print the line number, followed by a single space, 
and then the line content received as input.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        int i=1;
        while(true)
        {
	// if no more data can be read , break 
            if(scan.hasNextLine()== false) 
                break;
	//if more data can be read, scan and print
            else
            {
                s = scan.nextLine();
                System.out.println(i+" "+s);
                i++;
            }
        }
    }
}
