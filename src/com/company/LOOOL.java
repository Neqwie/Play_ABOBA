package com.company;
import java.lang.String;
import java.util.Scanner;

public class LOOOL {
    public static void main(String[] args){
        final String TEXT_BLUE = "\u001B[34m";
        final String TEXT_RED = "\u001B[31m";

        System.out.println();
        System.out.print("Выбери: Умножение(1),Сложение(2),Вычитание(3),Деление(4)");
        System.out.println("");
        Scanner now = new Scanner(System.in);
        int first = now.nextInt();

        if(first == 1){
            System.out.println("Введи первое число");
            Scanner terka = new Scanner(System.in);
            int full = terka.nextInt();

            System.out.println("Введи второе число");
            Scanner ui = new Scanner(System.in);
            int op = ui.nextInt();

            int result = full * op;
            System.out.println(result);
        }
        else if(first == 2){
            System.out.println("Введи первое число");
            Scanner terkal = new Scanner(System.in);
            int fu = terkal.nextInt();

            System.out.println("Введи второе число");
            Scanner ku = new Scanner(System.in);
            int po = ku.nextInt();

            int rum = fu + po;
            System.out.println(rum);
        }
        else if(first == 3){
            System.out.println("Введи первое число");
            Scanner terkali = new Scanner(System.in);
            int fur = terkali.nextInt();

            System.out.println("Введи второе число");
            Scanner kut = new Scanner(System.in);
            int pol = kut.nextInt();

            int rumd = fur - pol;
            System.out.println(rumd);
        }
        else if(first == 4){
            System.out.println("Введи первое число");
            Scanner terkalu = new Scanner(System.in);
            double fum = terkalu.nextInt();

            System.out.println("Введи второе число");
            Scanner kuk = new Scanner(System.in);
            double poi = kuk.nextInt();

            double rumda = fum / poi;
            System.out.println(rumda);
        }
        else{
            System.out.println(TEXT_RED + "Вы не правильно ввели команду, попробуйте ещё раз");

        };
    }



}
