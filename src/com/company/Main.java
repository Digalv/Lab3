package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task9();
        task20();
        task43();
        task64();
    }
    /*
     * Дано четное число N (> 0) и символы C1 и C2. Вывести строку длины N, которая состоит из чередующихся символов C1 и C2, начиная с C1
     */
    private static void task9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четное число N: ");
        final int N = scanner.nextInt();
        if (N%2 == 0)
        {
            System.out.println("Введите 1ый символ: ");
            String c1 = scanner.next();
            System.out.println("Введите 2ый символ: ");
            String c2 = scanner.next();
            if (c1.length() > 1 || c2.length() > 1)
            {
                System.out.println("Вы ввели больше 1го символа");
                task9();
            }
            for (int i = 0; i < N/2; i++)
            {
                System.out.print(c1 + " " + c2 + " ");
            }
        }
        else{
            System.out.println("Вы ввели нечетное число. Повторите еще раз");
            task9();
        }
    }
    /*
     * Дано целое положительное число. Вывести символы, изображающие цифры этого числа (в порядке слева направо)
     */
    private static void task20(){
        final int N = (int) (Math.random() * 100 + 1);
        System.out.println(N  + " - Изначальное число");
        String N_str = Integer.toString(N);
        for (int i = 0; i < N_str.length(); i++)
        {
            char ch = N_str.charAt(i);
            System.out.println((i + 1) + " цифра числа это " + ch);
        }
    }
    /*
     * Дана строка, состоящая из слов кириллицей, набранных заглавными буквами и разделенных пробелами (одним или несколькими).
     * Найти количество слов, которые содержат хотя бы одну букву «А».
     */
    private static void task43(){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim().toUpperCase();
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.indexOf('А') != -1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    /*
     * Дано зашифрованное предложение заданное кириллицей (способ шифрования описан в задании 63) и кодовое смещение K (0 < K < 10). Расшифровать предложение
     */
    private static void task64(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        char[] sim = str.toCharArray();
        int k = 5;
        for (int i = 0; i < sim.length; i++)
        {
            int code = (int) sim[i];
            if (code >= 1072 && code <= 1103)
            {
                code -=k;
                if(code < 1072)
                {
                    code = 1104 - (1072 - code);
                }
                sim[i] = (char) code;
                System.out.print(sim[i]);
            }
            if (code >= 1040 && code <= 1071)
            {
                code -=k;
                if(code < 1040)
                {
                    code = 1072 - (1040 - code);
                }
                sim[i] = (char) code;
                System.out.print(sim[i]);
            }
            if (code == 32)
            {
                System.out.print(sim[i]);
            }
        }
    }
}
