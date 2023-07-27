/*
 * task 2
 * Если необходимо, исправьте данный код (задание 2
 *  https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 * 
 *  ИСПРАВЛЕНИЯ и ДОБАВЛЕНИЯ:
 *  1) числитель в дроби, сначала создали массив типа int размерности 8
 *  2) заполнили его значениями
 *  3) изменила catchedRes1 с обычной переменной на массив длины 8
 *  4) заменила d на массив размерности 8 и заполнила его значениями от 0 до 7
 *  5) во время деления преобразовали одну из переменных в double
 *  6) заменили try-catch на if, т.к. ловили unchecked exception
 * 
 */
package hw2;
public class task2 {
    public static void main(String[] args) {
        int[] d = new int[8];
        int[] intArray = new int[8];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i*i;
            d[i] = i;
        }
        double[]  catchedRes1 = new double[8];
        for (int i = 0; i < intArray.length; i++) {
            if (d[7-i] == 0){
                System.out.println("Попытка деления на ноль! В массив записана 1!");
                catchedRes1[i] = 1.0;
            }
            else{
                catchedRes1[i] = Double.valueOf(intArray[i])/d[7-i];
            }
            System.out.println(catchedRes1[i] + " ");
        }
    }
}
