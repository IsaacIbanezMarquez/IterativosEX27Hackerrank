

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

// Scrabble_:

/*

Donada una paraula, obté la seva puntuació d'Scrabble.

Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
Input Format

Un String d'entrada.

Constraints

No n'hi ha.

Output Format

La puntuació obtinguda.

Sample Input 0

Poblenou
Sample Output 0

12
 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int punt = 0;
        int a = 0;

        while (a < word.length())
        {
            char c = word.charAt(a);

            if(c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U' | c == 'L' | c == 'N' | c == 'R' | c == 'S' | c == 'T')
            {
                c = 1;
                punt = punt + c;
            }
            else if ( c == 'a' | c == 'e'| c == 'i'| c == 'o'| c == 'u'| c == 'l'| c == 'n'| c == 'r'| c == 's'| c == 't')
            {
                c = 1;
                punt = punt + c;
            }
            else if (c == 'D' | c == 'G')
            {
                c = 2;
                punt = punt + c;
            }
            else if (c == 'd' | c == 'g')
            {
                c = 2;
                punt = punt + c;
            }
            else if ( c == 'B' | c == 'C' | c == 'M' | c == 'P')
            {
                c = 3;
                punt = punt + c;
            }
            else if (c == 'b'| c == 'c'| c == 'm'| c == 'p')
            {
                c = 3;
                punt = punt + c;
            }
            else if (c == 'F'| c == 'H'| c == 'V'| c == 'W'| c == 'Y')
            {
                c = 4;
                punt = punt + c;
            }
            else if(c == 'f'| c == 'h'| c == 'v'| c == 'w'| c == 'y')
            {
                c = 4;
                punt = punt + c;
            }
            else if(c == 'K')
            {
                c = 5;
                punt = punt + c;
            }
            else if (c == 'k')
            {
                c = 5;
                punt = punt + c;
            }
            else if (c == 'J'| c == 'X')
            {
                c = 8;
                punt = punt + c;
            }
            else if (c == 'j'| c == 'x')
            {
                c = 8;
                punt = punt + c;
            }
            else if (c == 'Q'| c == 'Z')
            {
                c = 10;
                punt = punt + c;
            }
            else if (c == 'q'| c == 'z')
            {
                c = 10;
                punt = punt + c;
            }
            a++;
        }
        System.out.println(punt);

    }
}
