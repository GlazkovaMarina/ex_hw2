/*
 * task3
 * Дан следующий код, исправьте его там, где требуется 
 * (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 * Исправления и добавления:
 * 1) переставили исключение Throwable в самый конец try-catch
 * 2) убрала FileNotFoundException, не может такое исключение там быть
 * 3) убрала по аналогии catch (NullPointerException ex)
 * 4) в данном примере оставила ловлю IndexOutOfBoundsException в try-catch, а не в if
 * 5) в иделае еще можно добавить ловлю исключения деления на ноль и передачи аргументов в функцию не тех типов
 */
package hw2;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
