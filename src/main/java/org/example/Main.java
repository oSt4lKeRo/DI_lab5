package org.example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n = 5;
		String str = "";
		float[] mas = new float[n];

		for(int i = 0; i < n; i++){
			float start = System.nanoTime();
			Scanner scanner = new Scanner(System.in);
			str += scanner.nextLine();
			float end = System.nanoTime();
			mas[i] = end - start;
		}

		float sum = 0;

		for(float i : mas){
			sum += i;
		}

		float perfectTime = (sum / n);
		sum = 0;
		System.out.println("Идеальное значение: " + perfectTime);


		for(float i : mas){
			sum += i - perfectTime;
		}
		float deviation = sum / n;
		System.out.println("Отклонение: " + deviation);


		str = "";
		for(int i = 0; i < n; i++){
			float start = System.nanoTime();
			Scanner scanner = new Scanner(System.in);
			str += scanner.nextLine();
			float end = System.nanoTime();
			mas[i] = end - start;
		}

		sum = 0;
		for(float i : mas){
			sum += i;
		}
		float perfectTime1 = (sum / n);
		sum = 0;

		for(float i : mas){
			sum += i - perfectTime;
		}
		float deviation2 = sum / n;

		int EPS = 5;

		if((perfectTime - perfectTime1) < EPS){
			if((deviation - deviation2) < EPS){
				System.out.println("Вы вошли");
			} else {
				System.out.println("Вы не вошли");
			}
		} else {
			System.out.println("Вы не вошли");
		}


	}
}