package com.company;
import java.lang.String;
import java.util.Scanner;

public class LOOOL {
    public static void main(String[] args){
        final String TEXT_BLUE = "\u001B[34m";
        final String TEXT_RESET = "\u001B[0m";
        final String TEXT_RED = "\u001B[31m";

        System.out.println();
        System.out.print(TEXT_BLUE + "Выбери: Умножение(1),Сложение(2),Вычитание(3),Деление(4)");
        System.out.println(TEXT_RESET + "");
        Scanner now = new Scanner(System.in);
        double first = now.nextDouble();

        if(first == 1){
            System.out.println("Введи первое число");
            Scanner terka = new Scanner(System.in);
            double full = terka.nextDouble();

            System.out.println("Введи второе число");
            Scanner ui = new Scanner(System.in);
            double op = ui.nextDouble();

            double result = full * op;
            System.out.println(result);
        }
        else if(first == 2){
            System.out.println("Введи первое число");
            Scanner terkal = new Scanner(System.in);
            double fu = terkal.nextDouble();

            System.out.println("Введи второе число");
            Scanner ku = new Scanner(System.in);
            double po = ku.nextDouble();

            double rum = fu + po;
            System.out.println(rum);
        }
        else if(first == 3){
            System.out.println("Введи первое число");
            Scanner terkali = new Scanner(System.in);
            double fur = terkali.nextDouble();

            System.out.println("Введи второе число");
            Scanner kut = new Scanner(System.in);
            double pol = kut.nextDouble();

            double rumd = fur - pol;
            System.out.println(rumd);
        }
        else if(first == 4){
            System.out.println("Введи первое число");
            Scanner terkalu = new Scanner(System.in);
            double fum = terkalu.nextDouble();

            System.out.println("Введи второе число");
            Scanner kuk = new Scanner(System.in);
            double poi = kuk.nextDouble();

            double rumda = fum / poi;
            System.out.println(rumda);
        }
        else{
            System.out.println(TEXT_RED + "Вы не правильно ввели команду, попробуйте ещё раз");
        }
    }



}
