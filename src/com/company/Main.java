package com.company;
import java.lang.String;
import java.math.*;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println();// пустая строчка в консоле
	System.out.println("Hello Nekrion<З");//вывод в консоль через строчку
	System.out.println("Hi and Bye");
	byte hn;//меньший объём
		hn = 50;
		int kl = 5000;// переменная со среденим объёмом
	System.out.println(kl);// вывод в консоль
	float Witcher = 3.68f;// дробь с малым объёмом
	float Cheburek = 5.87f;
	double Triss = 594.95945d;// дробь с большим объёмом
	boolean Rich = true;//используется для операций(1 или же 0)
    char SIM = 'J';//один символ меньший объём
		Math.random();
    String ME = "My Bike is long";//множество символов с большим объёмом
	System.out.println(ME);//вывод String
	int jkh = 200;// Это переменная ЖКХ плати налоги
	System.out.println(jkh + kl);// сложение
	System.out.println((int) (Witcher + Cheburek));// округление
	System.out.println("Данила ты в коде " + (int)(Math.random() * 100));// сложение
	System.out.println(" Вывод чисел");
		Scanner SPID = new Scanner(System.in);
		String str = SPID.nextLine();
		System.out.println(str);
    }
}
