package ReinardCoxTestClass;

import java.util.Scanner;


public class EnterNumberChangeRoman {
    public static void main(String[] args) {

        while (true) {


            System.out.print("Please enter a value: ");
            Scanner userInput = new Scanner(System.in);
            String letter = "";
            int numX;
            numX = userInput.nextInt();

            if (numX >= 1000){
                while ( numX >= 1000) {
                    letter += ("M");
                    numX -= 1000;
                }
            }//System.out.println(numX);

            if (numX >= 900 && numX < 1000){
                letter += ("CM");
                numX -= 900;
            }//System.out.println(numX);

            if (numX >= 500) {
                while ( numX >= 500) {
                    letter += ("D");
                    numX -= 500;
                }
            } //System.out.println(numX);

            if (numX >= 400 && numX < 500){
                letter += ("CD");
                numX -= 400;
            }//System.out.println(numX);

            if (numX >=100) {
                while ( numX >= 100) {
                    letter += ("C");
                    numX -= 100;
                }
            }//System.out.println(numX);

            if (numX >= 90 && numX < 100){
                letter += ("XC");
                numX -= 90;
            }//System.out.println(numX);

            if (numX >=50) {
                while ( numX >= 50) {
                    letter += ("L");
                    numX -= 50;
                }
            }//System.out.println(numX);

            if (numX >= 40 && numX < 80){
                letter += ("XL");
                numX -= 40;
            }//System.out.println(numX);

            if (numX >=10 ) {
                while ( numX >= 10) {
                    letter += ("X");
                    numX -= 10;
                }
            }//System.out.println(numX);

            if (numX == 0) {
                //System.out.println(letter);
            } else if (numX == 9) {
                letter += "IX";
                //System.out.println(letter);
            } else if (numX >= 5 && numX < 9) {
                letter += "V";
                numX -= 5;
                while (numX >= 1) {
                    letter += ("I");
                    numX -= 1;
                }

            } else if (numX >= 4 && numX <= 4) {
                letter += "IV";
                numX -= 4;
                while (numX >= 1) {
                    letter += ("I");
                    numX -= 1;
                }

                //System.out.println(letter);

            } else {

                while (numX > 0) {
                    letter += ("I");
                    numX -= 1;
                }
            }System.out.println(letter);



        }
    }
}