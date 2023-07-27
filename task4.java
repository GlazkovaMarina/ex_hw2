/*
 * task 4
 * Разработайте программу, которая выбросит Exception,
 *  когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
package hw2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try {
            System.out.println("Please, input string: ");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if (line.isEmpty()){
                throw new Exception("Пустая строка!");
            }
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }
}
