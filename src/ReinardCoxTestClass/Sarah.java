package ReinardCoxTestClass;
import java.util.Scanner;
/**
 * Created by djshadowslim on 3/10/15.
 */
public class Sarah {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String romanNumeral = "";


        while (number > 0) {
            if (number >= 4000) {
                System.out.println("Try again.");
                return;
            } else if (number < 4000 && number >= 1000) {
                number -= 1000;
                romanNumeral += "M";
            } else if (number < 1000 && number >= 500) {
                if (number >= 900) {
                    number -= 900;
                    romanNumeral += "CM";
                } else {
                    number -= 500;
                    romanNumeral += "D";
                }
            } else if (number < 500 && number >= 100) {
                if (number >= 400) {
                    number -= 400;
                    romanNumeral += "CD";
                } else {
                    number -= 100;
                    romanNumeral += "C";
                }
            } else if (number < 100 && number >= 50) {
                if (number >= 90) {
                    number -= 90;
                    romanNumeral += "XC";
                } else {
                    number -= 50;
                    romanNumeral += "L";
                }
            } else if (number < 50 && number >= 10) {
                if (number >= 40) {
                    number -= 40;
                    romanNumeral += "XL";
                } else {
                    number -= 10;
                    romanNumeral += "X";
                }
            } else if (number < 10 && number >= 5) {
                if (number >= 9) {
                    number -= 9;
                    romanNumeral += "IX";
                } else {
                    number -= 5;
                    romanNumeral += "V";
                }
            } else if (number < 5 && number >= 1) {
                if (number >= 4) {
                    number -= 4;
                    romanNumeral += "IV";
                } else {
                    number -= 1;
                    romanNumeral += "I";
                }
            } else {
                return;
            }
            System.out.println(romanNumeral + 1);
        }
    }

}