import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
/*
public class Main {
    public static void main(String[] args) {
//        String[] fruits = {"Apple", "Banana", "Orange" , "Avocado"};
//        int[] integers = {10, 20, 30, 40};
/*
        System.out.println(fruits[0]);
        fruits[0] = "lime";
        System.out.println(fruits[0]);

        System.out.println(fruits.length);
*/
/*        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }*/

/*        for(String fruit : fruits){
            System.out.println(fruit);*/
/*
        for(String a : fruits){
            System.out.println(a);
        }
*/
/*
        int[] myIntegers = new int[10];

        for(int i = 0; i < myIntegers.length;i++){
            myIntegers[i] = i;
        }

        for(int i = 0; i < myIntegers.length; i++){
            System.out.println(myIntegers[i]);
        }
*/

/*      int[][] myIntegers = {{1 ,2 ,3 ,4}, {5 , 6 ,7 ,8}};
        int x = myIntegers[1][2];
        System.out.println(x);

        for( int i = 0; i < myIntegers.length;i++){
            for(int j = 0; j < myIntegers[i].length; j++){
                if (myIntegers[i][j] % 2 == 0)
                System.out.print(myIntegers[i][j] + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
*/
/*     int[][] myArray = new int[4][4];
       int counter = 0;
       for (int i = 0; i < myArray.length; i++){
           for(int j = 0; j < myArray[i].length; j++){
               myArray[i][j] = counter;
               counter++;
           }
       }

       for(int i = 0; i < myArray.length; i++){
           for(int j = 0; j < myArray.length; j++){
               if (i == j)
                   System.out.print(myArray[i][j] + " ");
               else
                   System.out.print(0 + " ");
           }
           System.out.println();
       }
 */

        //Домашнее задание

//#1
        /*
        int myNumber [] = {1, 3, 4, 1, 5, 5,};
        double sum = 0;
        for (int x: myNumber) {
            sum += x;
        }
        System.out.print("Cреднее значение: " + sum/myNumber.length);
        */

//№2
/*
        int[] myArray = {1, 3, 4, 1, 5, 5,};

        for (int i = 0; i < myArray.length-1; i++)
        {
            for (int j = i+1; j < myArray.length; j++)
            {
                if ((myArray[i] == myArray[j]) && (i != j))
                {
                    System.out.println("Дубликаты : "+ myArray[j]);
                }
            }
        }*/

//№3
/*
a)      int[] intArray = new int[]{1, 3, -6, 23, 14, 2};   //Данное решение я нашёл в интернете,но я разобрался как оно работает и за что отвечает
        boolean found = false;                             //я хотел вывести через if без boolean не получилось
        int searchedValue = 23;
        for(int x : intArray){
            if(x == searchedValue){
                found = true;
                break;
            }
        }

        System.out.println(found);*/

/*      b)
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        boolean found = false;
        int searchedValue = 0;

        for(int x : intArray){
            if(x == searchedValue){
                found = true;
                break;
            }
        }

        System.out.println(found);*/

//№4
/*     a)
        int[] myNumber = {1, 3, -6, 23, 14, 2};
        int x = 23;
        for (int i = 0; (i < myNumber.length) && (x == 23); i++) {
            if (myNumber[i] == 23) {
                x = i;
            }
        }
        System.out.println(x);*/
/*      b)
        int[] myNumber = {1, 3, -6, 23, 14, 2};    //Вроде это не соответствует заданной задаче,если нет то исправлю
        int x = 5;
        for (int i = 0; (i < myNumber.length) && (x == 5); i++) {
            if (myNumber[i] == 5) {
                x = i;
            }
        }
        System.out.println();*/
//№5
        /* Изначально пробовал так.
        int[] intArray = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        int[] resultArray = new int[m - n];
        int count  = 0;
        for(int i = n; n < m; i++){
            intArray[count] = resultArray[i];
            count++;
        }
        for (int i = 0; i < resultArray.length;i++)
            System.out.println(resultArray);*/
//a)
/*
              public class Main {
                  public static void printSubArray(int[] originalArray, int n, int m) {
                      int[] resultArray = new int[m - n + 1];
                      int count = 0;
                      for (int i = n; i <= m; i++) {
                          resultArray[count] = originalArray[i];
                          count++;
                      }
                      Arrays.stream(resultArray).forEach(System.out::println);
                  }

                  public static void main(String[] args) {
                      int[] myArray = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
                      printSubArray(myArray, 3, 8);*/
//b)

public class Main {
    public static void printSubArray(int[] originalArray, int n, int m) {
        int[] resultArray = new int[m - n + 1];
        int count = 0;
        for (int i = n; i <= m; i++) {
            resultArray[count] = originalArray[i];
            count++;
        }
        Arrays.stream(resultArray).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 3, -6, 23, 14, 2};
        printSubArray(myArray, 1, 3);
//№6
        /*
        int[] intArray = {1, 3, -6, 23, 14, 2};
        int maxNum = intArray[0];
        int minNum = intArray[0];
        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }
        for (int z : intArray){
            if (z < minNum)
                minNum = z;
        }

        System.out.println("Максимальное значение " + maxNum);
        System.out.println("Минимальное значение " + minNum);*/

//№7
/*
        int[] elements = {1, 3, -6, 23, 14, 2};
        int firstSmallest = 0;
        int secondSmallest = 0;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (elements[i] < firstSmallest) {
                    firstSmallest = elements[i];

                    if (elements[j] > secondSmallest) {
                        secondSmallest = elements[j];
                    }
                }
            }

        }
        System.out.println("Наименьший элемент: " + firstSmallest + "\n" + "Второй наименьший элемент: " + secondSmallest);
*/
//#8
        /*
        int[] array = {1, 2, 3, 0, 4, 6};
        for( int i = 0; i < array.length;i++){
            for(int j = 0; j < array[i]; j++){
                if (array[i][j] % 2 == 0)
                    System.out.print(array[i][j] + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }*/

//№9
/*
        int[][] myIntegers = {{10, 20, 30}, {40, 50, 60}};
        System.out.print("Дано:\n");
        print_array(myIntegers);
        System.out.print("\n" +
                "\n" +
                "Вывод:");
        transpose(myIntegers);
    }

    public static void transpose(int[][] myIntegers) {

        int[][] myArray = new int[myIntegers[0].length][myIntegers.length];

        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = 0; j < myIntegers[0].length; j++) {
                myArray[j][i] = myIntegers[i][j];
            }
        }

        print_array(myArray);
    }

    public static void print_array(int[][] myIntegers) {
        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = 0; j < myIntegers[0].length; j++) {
                System.out.print(myIntegers[i][j] + " ");
            }
            System.out.println();
        }
//b
/*      int[][] myIntegers = {{4, 2, 1}, {2, 7, 2}};
        System.out.print("Дано:\n");
        print_array(myIntegers);
        System.out.print("\n" +
                "\n" +
                "Вывод:");
        transpose(myIntegers);
    }

    public static void transpose(int[][] myIntegers) {

        int[][] myArray = new int[myIntegers[0].length][myIntegers.length];

        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = 0; j < myIntegers[0].length; j++) {
                myArray[j][i] = myIntegers[i][j];
            }
        }

        print_array(myArray);
    }

    public static void print_array(int[][] myIntegers) {
        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = 0; j < myIntegers[0].length; j++) {
                System.out.print(myIntegers[i][j] + " ");
            }
            System.out.println();
        }*/
//№10
        /*
        int[][] array = {{10, 20, 30}, {40, 50, 60}};
        int sum = 0;
        for (int[] innerArray : array)
            for (int i : innerArray)
                sum += i;
        System.out.println("Сумма:" + sum);
         */


//№11   a) Пробовал написать через boolean,не смог попробовал этим способом
/*
        int[][] a = {{10,20,30}, {40,50,60}};
        for (int i=0; i<a.length;i++) {
            for (int j=0;j<a[i].length-1;j++) {
                if (a.length==a[j].length) {
                    System.out.println("False");
                }else {
                    System.out.println("True");
                }
            }
        }
 */
 /*
        b)
        int[][] a = {{10,20,}, {40,50,}};
        for (int i=0; i<a.length;i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                if (a.length == a[j].length) {
                    System.out.println("False");
                } else {
                    System.out.println("True");
                }
            }
        }*/

//№12
        /*
      int[][] arrMultipleTable = new int[5][5];
        int row = 1, column = 1;
        for(int a = 0; a < arrMultipleTable.length; a++)
        {
            for(int b = 0; b < arrMultipleTable[a].length; b++)
            {
                arrMultipleTable[a][b] = row * column;
                column = column + 1;
            }
            row = row + 1;
            column = 1;
        }
        for(int a = 0; a < arrMultipleTable.length; a++)
        {
            for(int b = 0; b < arrMultipleTable[a].length; b++)
            {
                System.out.print(" " + arrMultipleTable[a][b] + "\t| ");
            }
            System.out.print("\n");
        }
//№13
        /*
        int a[][] = {{10, 20, 30}, {40,50,60}};
        int max = a[0][0];
        int min = a[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            for (int w = 0; w > 2; w++){
                for (int l = 0; l < 3; l++){
                    if (a[w][l] < max) {
                        min = a[w][l];
                    }
                }
            }
        }
        System.out.println("Максимальный элемент" + max);
        System.out.println("Минимальный элемент" + min);*/
    }
}