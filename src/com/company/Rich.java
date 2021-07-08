package com.company;

import java.util.Scanner;

public class Rich {
    public static void main (String[] args){// Это хйня какая-то не шарю, но работает
    System.out.println();//Пропуск строчик для красоты
    System.out .println("-=[Тест на Абобу]=-");//Вывод надписи(Начальный экран)
    Scanner SPID = new Scanner(System.in);//Сканер make
    String str = SPID.nextLine();//Назначение переменной
    if(str.equals("1")){// 1 УО при значении в скобках выполняектся команда ниже
    System.out.println("-=[Ты пидор]=-");//Вывод команды при усл.
    }
    else if (str.equals("5")){//УО при значении в скобках(5) выводится надпись ниже(если не выполняется команда выше)
    System.out.println("⚠-=[Данила Абоба]=-⚠");//Вывод надписи
    }
    else{// УО при котором выполняется команда если отсальные нет
    System.out.println("-=[Ты не угадал]=-");//Вывод надписи
    System.out.println("       ...");//Вывод конца игры
        }
    }
}
