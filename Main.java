package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println(findFactorial(5));
        // printPrimeNumbers();

        int num1 = getNumber();
        int num2 = getNumber();
        char operator = getOperator();
        int result = calc(num1, num2, operator);
        System.out.println("Равно" + result);

        }


    /**
     * Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     */
    public static int findFactorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact*i;
        }
        return fact;
    }

    /**
     * Задача 2. Вывести все простые числа от 1 до 1000
     */
    public static void printPrimeNumbers() {
        int x = 1000;
        for (int i = 2; i < x; i++) {
            boolean y = true;
            int m = (int) Math.sqrt(i);
            for (int j = 2; j <= m ; j++) {
                if ((i % j) == 0) {
                    y = false;
                    break;
                }
            }
            if (y) {
                System.out.print(i + ", ");
            }
        }
    }
    /**
     * Задача 3. Реализовать простой калькулятор
     */
    static Scanner iScanner = new Scanner(System.in);
    public static int getNumber() {
        System.out.println("Введите число: ");
        int num;
        if(iScanner.hasNextInt()) {
            num = iScanner.nextInt();
        }
        else {
            System.out.println("Это не число, введите число: ");
            iScanner.next();
            num = getNumber();
        }
        return num;
    }
    public static char getOperator() {
        System.out.println("Введите одну из операций: +, -, *, /. Вводите:  ");
        char operator;
        if (iScanner.hasNext()) {
            operator =iScanner.next().charAt(0);
        }
        else {
            System.out.println("Операция не корректна, введите одну из операций: +, -, *, / ");
            iScanner.next();
            operator = getOperator();
        }
        return operator;
    }
    public static int calc(int num1, int num2, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Введите операцию");
                result = calc(num1, num2,getOperator());
        }
        return result;
    }

}