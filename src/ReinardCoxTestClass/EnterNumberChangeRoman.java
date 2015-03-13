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

    public static int parse(String number) { // string goes in, number comes out
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
    
    
    
    
}



