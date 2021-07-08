package com.company;

import java.util.Scanner;

public class Rich {
    public static void main (String[] args){
System.out.println();
System.out .println("-=[Тест на Абобу]=-");
        Scanner SPID = new Scanner(System.in);
        String str = SPID.nextLine();
        if(str.equals("1")){
            System.out.println("-=[Ты пидор]=-");
        }
        else if (str.equals("5")){
            System.out.println("⚠-=[Данила Абоба]=-⚠");
        }
        else{
            System.out.println("-=[Ты не угадал]=-");
            System.out.println("       ...");
        }
    }
}
