/*
 * task1
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 *  вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
package hw2;

import java.util.Scanner;

public class task1 {

    public static Boolean isFloat(String str){
        try{
            Float.parseFloat(str);
        } catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    public static float getFloat(){
        String line = null;
        do{
            System.out.println("Please, input float number: ");
            Scanner scanner = new Scanner(System.in);
            line = scanner.nextLine();
        } while(!isFloat(line));
        float float_number = Float.parseFloat(line);
        return float_number;
    }
    public static void main(String[] args) {
        System.out.println("You input: " + getFloat());
    }
}
