package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Биринчи санды киргизиниз: ");
        int number1 = sc.nextInt();
        System.out.print("экинчи санды киргизиниз: ");
        int number2 = sc.nextInt();
                while (number1<number2) {
                    if (number1 % 2 ==1){
                        number1+=2;
                        if(number1>number2-1) {
                            break;
                        }
                        System.out.println(number1 + " ");
                    }else{
                        number1++;
                        System.out.println(number1);
                    }
                }

    }
}




