package com.company;

import java.util.Scanner;



class Main {

    public static String calc(String inputString) {
            String[] numberRome = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String[] numberArab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

            String[] subString = inputString.split(" ");
            if (subString.length != 3)
                throw new ArithmeticException();
            int a = 0, b = 0, at = 0, bt = 0, r;
            for (int i = 1; i <= 10; i++) {


                if (subString[0].equals(numberRome[i])) {
                    a = i;
                    at = 1;
                }
                if (subString[0].equals(numberArab[i])) {
                    a = i;
                    at = 2;
                }
                if (subString[2].equals(numberRome[i])) {
                    b = i;
                    bt = 1;
                }
                if (subString[2].equals(numberArab[i])) {
                    b = i;
                    bt = 2;
                }
            }
            if (at==0 || bt == 0 || at != bt)
                throw new ArithmeticException();
            switch (subString[1]) {
                case "+":
                    r = a + b;
                    break;
                case "-":
                    r = a - b;
                    break;
                case "*":
                    r = a * b;
                    break;
                case "/":
                    r = a / b;
                    break;
                default:
                    throw new ArithmeticException();
            }
            if (at == 2)
                return Integer.toString(r);
            if (r < 1)
                throw new ArithmeticException();
            String s = "";
            if (r == 100)
                s = "C";
            switch (r / 10)
         {
                case 1:
                    s = "X";
                    break;
                case 2:
                    s = "XX";
                    break;
                case 3:
                    s = "XXX";
                    break;
                case 4:
                    s = "XL";
                    break;
                case 5:
                    s = "L";
                    break;
                case 6:
                    s = "LX";
                    break;
                case 7:
                    s = "LXX";
                    break;
                case 8:
                    s = "LXXX";
                    break;
                case 9:
                    s = "XC";
                    break;
            }
            switch (r % 10) {
                case 1:
                    s += "I";
                    break;
                case 2:
                    s += "II";
                    break;
                case 3:
                    s += "III";
                    break;
                case 4:
                    s += "IV";
                    break;
                case 5:
                    s += "V";
                    break;
                case 6:
                    s += "VI";
                    break;
                case 7:
                    s += "VII";
                    break;
                case 8:
                    s += "VIII";
                    break;
                case 9:
                    s += "IX";
                    break;
            }
            return s;
        }


    public static void main(String[] args) {

            System.out.println("Введите арифметическое выражение: ");
            Scanner in = new Scanner(System.in);
            String m = in.nextLine();
            System.out.println("Input:  " + m);
            String r = Main.calc(m);
            System.out.println("Output:  " + r);


    }
}









































