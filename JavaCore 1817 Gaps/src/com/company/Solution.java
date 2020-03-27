package com.company;

/*
1817 Gaps
In the main method, the first parameter is the name of the file.
Display the ratio of the number of spaces to the number of all characters. For example, 10.45.
1. Count the number of all characters.
2. Calculate the number of spaces.
3. Display n2 / n1 * 100 on the screen, rounding to 2 decimal places.
4. Close the threads.

Requirements:
1. You do not need to read anything from the console.
2. Create a read stream from the file, which comes as the first parameter in main.
3. Calculate the ratio of spaces to all characters in the file and print this number to the console.
4. The displayed value must be rounded to 2 decimal places.
5. The stream of reading from the file should be closed.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
//        args = new String[]{"d:\\_JavaRush\\_Test\\Dear Sir or Madam.txt"};

        try (FileReader fileReader = new FileReader(args[0])) {
            int symbol;
            int countSpaces = 0;
            int countSymbols = 0;
            while ((symbol = fileReader.read()) != -1) {
                countSymbols++;
                if (symbol == ' ') {
                    countSpaces++;
                }
            }

            System.out.printf("%.2f%n", (double) countSpaces / countSymbols * 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



