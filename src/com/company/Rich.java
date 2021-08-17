package com.company;

import java.awt.*;
import java.util.Scanner;

public class Rich {
    public static void main (String[] args){// Это хйня какая-то не шарю, но работает
        final String TEXT_BLUE = "\u001B[34m";
        final String TEXT_RED = "\u001B[31m";
    System.out.println();//Пропуск строчик для красоты
    System.out .println(TEXT_BLUE + "-=[Тест на Абобу]=-");//Вывод надписи(Начальный экран)
    Scanner SPID = new Scanner(System.in);//Сканер make
    String str = SPID.nextLine();//Назначение переменной
    if(str.equals("1")){// 1 УО при значении в скобках выполняектся команда ниже
    System.out.println(TEXT_RED + "-=[Ты пидор]=-");//Вывод команды при усл.
    }
    else if (str.equals("5")){//УО при значении в скобках(5) выводится надпись ниже(если не выполняется команда выше)
    System.out.println(TEXT_BLUE + "⚠-=[Данила Абоба]=-⚠");//Вывод надписи
    }
    else{// УО при котором выполняется команда если отсальные 5нет
    System.out.println("-=[Ты не угадал]=-");//Вывод надписи
    System.out.println("       ...");//Вывод конца игры
        }
    }
}
