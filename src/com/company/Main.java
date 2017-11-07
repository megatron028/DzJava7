package com.company;

import java.util.Scanner;

/*Ввести с клавиатуры строку. Затем ввести строку-разделитель и образовать массив строк, разделив исходную строку на подстроки с помощью разделителя.
в случае отсутствия разделителя внутри исходной строки вывести сообщение о невозможности разделения строки на подстроки.
 Вывести на экран получившиеся подстроки*/
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String bl= in.nextLine();
	Scanner id = new Scanner(System.in);
	String raz= id.nextLine();
	boolean flag = bl.contains(raz);
	if (flag == true){
		String[] sl = bl.split(raz);
		for (int i = 0; i < sl.length;i++){
			System.out.println(sl[i]);
		}
	}
	else {
		System.out.println("false");
	}
    }
}
