import java.util.Scanner;
public class d {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            //Take input from user
            //Program will print given roman numeral which is determined after user input is converted by the code
            //in the program.

            int number = input.nextInt();
            String romanNumeral = "";

            //If the input by the user is greater than or equal to 4000 the program will prompt
            //the user to try again and the program will run again.

            while (number >= 4000) {
                System.out.print("Try again");
                break;
            }
            // For numbers smaller than 4000 and equal to or greater than 1000 the program will subtract
            //one thousand each time until the number reaches zero. For each one thousand that the
            //program subtracts it will replace the 1000 with an M
            while (number < 4000 && number >= 1000) {
                number -= 1000;
                romanNumeral += "M";
            }

            //For numbers smaller than one thousand and greater than or equal to 500, the program
            //will subtract 900 from the input each time until 900.
            //Each 900 that is subtracted will be replaced by a CM.
            //If the number is smaller than 900 the program will subtract 500, and replace the 500 with a D

            while (number < 1000 && number >= 500) {
                if (number >= 900) {
                    number -= 900;
                    romanNumeral += "CM";
                } else {
                    number -= 500;
                    romanNumeral += "D";
                }
            }

            //For numbers smaller than 500 and greater than or equal to 100: First the program will subtract 400 while the number
            // is greater than or equal to 400, and replace it with a CD.
            // but if the number is lower than 400, 100 will be subtracted while the number is still within the range of
            // 400 and 100, each 100 that is removed will be replaced by a C.
            while (number < 500 && number >= 100) {
                if (number >= 400) {
                    number -= 400;
                    romanNumeral += "CD";
                } else {
                    number -= 100;
                    romanNumeral += "C";
                }
            }

            ///For numbers smaller than 100 and greater than or equal to 50.
            // The program will check if the number is smaller 100 and greater
            // than or equal to 90. If it is, then the program will take away 90 and replace it by XC. If the input
            //is smaller than 90 then the program will subtract 50 and replace that 50 with an L.
            while (number < 100 && number >= 50) {
                if (number >= 90) {
                    number -= 90;
                    romanNumeral += "XC";
                } else {
                    number -= 50;
                    romanNumeral += "L";
                }
            }

            //Then the program will check if the input includes numbers between 50 and equal to or greater than 10.
            // if the number is between 50 and equal to or greater than 40 the program will remove 40 and replace it
            // with XL. But if the number is less than 40 the program will instead replace each 10 it can remove with
            //an X.
            while (number < 50 && number >= 10) {
                if (number >= 40) {
                    number -= 40;
                    romanNumeral += "XL";
                } else {
                    number -= 10;
                    romanNumeral += "X";
                }
            }

            //Then the program will check numbers between 10 and greater than or equal to 5. If the number is between
            //10 and greater than or equal to 9 then the program will subtract 9 and replace that 9 with an IX.
            //But if the number is less than 9, then the program will subtract 5 and replace it with a V.

            while (number < 10 && number >= 5) {
                if (number >= 9) {
                    number -= 9;
                    romanNumeral += "IX";
                } else {
                    number -= 5;
                    romanNumeral += "V";
                }
            }

            //Then the program will check for numbers smaller than 5 and greater than or equal to 1
            // if the number is greater than or equal to 4 the program will subtract 4 and replace it with an IV. If
            // the number is less than 4, the program will subtract one and replace each one with an I.
            while (number < 5 && number >= 1) {
                if (number >= 4) {
                    number -= 4;
                    romanNumeral += "IV";
                } else {
                    number -= 1;
                    romanNumeral += "I";
                }
            }
            //If the user input is smaller than zero (A negative number), the program will print "You cannot enter a
            //negative number and the program breaks.
            while (number < 0) {
                System.out.print("You cannot enter a negative number");
                break;
            }
//Once the program converts all of the numbers into roman numerals, it will print out the number in Roman Numeral form.

            System.out.println(romanNumeral);



            }
        }

    }
