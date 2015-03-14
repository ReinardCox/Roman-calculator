package nyc.c4q.ac21.romancalc;
import java.util.Scanner;
/**
 * Code to convert to and from Roman numerals.
 */
public class RomanNumerals {
    /**
     * Formats a number in Roman numerals.
     * @param value
     *   The value to format.
     * @return
     *   The value in Roman numerals.
     */
    static String format(int value) {

        String letter = "";

        if (value >= 1000){
            while ( value >= 1000) {
                letter += ("M");
                value -= 1000;
            }
        }//System.out.println(numX);

        if (value >= 900 && value < 1000){
            letter += ("CM");
            value -= 900;
        }//System.out.println(numX);

        if (value >= 500) {
            while ( value >= 500) {
                letter += ("D");
                value -= 500;
            }
        } //System.out.println(numX);

        if (value >= 400 && value < 500){
            letter += ("CD");
            value -= 400;
        }//System.out.println(numX);

        if (value >=100) {
            while ( value >= 100) {
                letter += ("C");
                value -= 100;
            }
        }//System.out.println(numX);

        if (value >= 90 && value < 100){
            letter += ("XC");
            value -= 90;
        }//System.out.println(numX);

        if (value >=50) {
            while ( value >= 50) {
                letter += ("L");
                value -= 50;
            }
        }//System.out.println(numX);

        if (value >= 40 && value < 80){
            letter += ("XL");
            value -= 40;
        }//System.out.println(numX);

        if (value >=10 ) {
            while ( value >= 10) {
                letter += ("X");
                value -= 10;
            }
        }//System.out.println(numX);

        else if (value == 0) {
            //System.out.println(letter);
        } else if (value == 9) {
            letter += "IX";
            //System.out.println(letter);
        } else if (value >= 5 && value < 9) {
            letter += "V";
            value -= 5;
            while (value >= 1) {
                letter += ("I");
                value -= 1;
            }

        } else if (value >= 4 && value <= 4) {
            letter += "IV";
            value -= 4;
            while (value >= 1) {
                letter += ("I");
                value -= 1;
            }

            //System.out.println(letter);

        } else {

            while (value > 0) {
                letter += ("I");
                value -= 1;
            }
        }return letter;
    }


    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String number) {

            Scanner keyboard = new Scanner(System.in);
            // TODO: Group 2: Write this function!
            int answer = 0;

            for (int j = 0; j < (number.length()); j ++) {
                if (number.charAt(j) != 'M' && number.charAt(j) != 'C'&& number.charAt(j) != 'D' && number.charAt(j) != 'X' && number.charAt(j) != 'L' && number.charAt(j) != 'V' && number.charAt(j) != 'I') {
                    return -1;
                }
            }

            for (int i = 0; i < number.length(); i ++) {
                if (number.charAt(i) == 'M') {
                    answer += 1000;
                } else if (i != (number.length() - 1) && (number.charAt(i) == 'C' && number.charAt(i + 1) == 'M')) {
                    answer += 900;
                    i++;
                } else if (number.charAt(i) == 'D') {
                    answer += 500;
                } else if (i != (number.length() - 1) && (number.charAt(i) == 'C' && number.charAt(i + 1) == 'D')) {
                    answer += 400;
                    i++;
                } else if (number.charAt(i) == 'C') {
                    answer += 100;
                } else if (i != (number.length() - 1) && (number.charAt(i) == 'X' && number.charAt(i + 1) == 'C')) {
                    answer += 90;
                    i++;
                } else if (number.charAt(i) == 'L') {
                    answer += 50;
                } else if (i != (number.length() - 1) && (number.charAt(i) == 'X' && number.charAt(i + 1) == 'L')) {
                    answer += 40;
                    i++;
                } else if (number.charAt(i) == 'X') {
                    answer += 10;
                } else if (i != (number.length() - 1) && (number.charAt(i) == 'I' && number.charAt(i + 1) == 'X')) {
                    answer += 9;
                    i++;
                } else if (number.charAt(i) == 'V') {
                    answer += 5;
                } else if (i != (number.length() - 1) && (number.charAt(i) == 'I' && number.charAt(i + 1) == 'V')) {
                    answer += 4;
                    i++;
                } else if (number.charAt(i) == 'I') {
                    answer += 1;
                } else {
                    answer += 0;
                }
                continue;
            }
            //System.out.println(answer);
            //System.out.println("The input is " + number);
            return answer;//stop that the part of the program from running

        }


    public static void main(String[] argv) {
        // TODO: Group 3: Write this function!
        // It should test that format() and parse() work correctly.
    }
}
