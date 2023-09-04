/*Операторы сравнения и логические операторы:1задание
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner chislan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n=chislan.nextInt();
        if (n%2==0) {
            System.out.println("Переменная n-чётное число");
        }
        else {
            System.out.println("Переменная n-нечётное число");
        }
    }
}

/*Операторы сравнения и логические операторы:2задание через if-else
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dzientygodnia = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n=dzientygodnia.nextInt();
        if (n<1) {
            System.out.println("Такого дня нет");
        }  else if ((n==1)){
            System.out.println("День недели-понедельник");
        }  else if ((n==2)){
            System.out.println("День недели-вторник");
        }  else if ((n==3)){
            System.out.println("День недели-среда");
        }  else if ((n==4)){
            System.out.println("День недели-четверг");
        }  else if ((n==5)){
            System.out.println("День недели-пятница");
        }  else if ((n==6)){
            System.out.println("День недели-суббота");
        }  else if ((n==7)){
            System.out.println("День недели-воскресенье");
        }  else if ((n>7)){
            System.out.println("Такого дня нет");
        }
    }
}
/*Операторы сравнения и логические операторы:2задание через switch
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dzientygodnia = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n=dzientygodnia.nextInt();
        switch (n) {
            case 1:
                System.out.println("День недели-понедельник");
                break;
            case 2:
                System.out.println("День недели-вторник");
                break;
            case 3:
                System.out.println("День недели-среда");
                break;
            case 4:
                System.out.println("День недели-четверг");
                break;
            case 5:
                System.out.println("День недели-пятница");
                break;
            case 6:
                System.out.println("День недели-суббота");
                break;
            case 7:
                System.out.println("День недели-воскресенье");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}
/*Операторы сравнения и логические операторы:3задание
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        System.out.println("Сумма двух наибольших чисел равна");
        if (c <= b && a >= c) {
            System.out.println(a + b);
        }
        else if (a < b && c > a) {
            System.out.println(b + c);
        } else  {
            System.out.println(a + c);
        }
    }
}

/*Операторы сравнения и логические операторы:4задание
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Данный год имеет");
        int n=1300;
        if (n%4!=0) {
            System.out.println("365 дней");
        }  else if(n%100==0&&n%400!=0) {
            System.out.println("365 дней");
        }  else {
            System.out.println("366 дней");
        }
    }
}