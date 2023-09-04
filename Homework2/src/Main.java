/*Массивы:1задание
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int capacity=sc.nextInt();

        int[] array=new int[capacity];

        int max=99;
        int min=10;
        int m=0;
        for (int i=0; i < array.length; i++) {
            array[i]=(int) ((Math.random()*(max-min))+min);
        }
        System.out.println("Числа");
        for (int a:array) {
            System.out.print(a+",");
        }
        if (array[m+1]>array[m]){
            m++;
        }
        if(m==array.length-1){
            System.out.println("-этот массив строго возрастающая последовательность");
        }
        else{
            System.out.println("-этот массив не строго возрастающая последовательность");
        }
    }
}

/*Массивы:2задание
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int capacity=sc.nextInt();
        while (capacity <= 0) {
            System.out.println("Введите ещё раз, положительное целое число");
            capacity=sc.nextInt();
        }

        int[] array=new int[capacity];
        System.out.println("Нижний диапозон значения");
        int min=sc.nextInt();

        System.out.println("Верхний диапозон значения");
        int max=sc.nextInt();
        while (max <= min) {
            System.out.println("Верхняя граница не может быть равна или меньше нижней, введите новое число");
            max=sc.nextInt();
        }

        for (int i=0; i < array.length; i++) {
            array[i]=(int) ((Math.random()*(max-min))+min);
        }
        System.out.println("Числа");
        for (int a:array) {
            System.out.print(a+",");
        }
    }
}
/*Массивы:3задание
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int N=sc.nextInt();
        while (N <= 0) {
            System.out.println("Введите ещё раз, положительное целое число");
            N=sc.nextInt();
        }

        int[] array=new int[N];
        System.out.println("Нижний диапозон значения");
        int Amin=sc.nextInt();

        System.out.println("Верхний диапозон значения");
        int Bmax=sc.nextInt();
        while (Bmax <= Amin) {
            System.out.println("Верхняя граница не может быть равна или меньше нижней, введите новое число");
            Bmax=sc.nextInt();
        }

        for (int i=0; i < array.length; i++) {
            array[i]=(int) ((Math.random()*(Bmax-Amin))+Amin);
        }
        System.out.println("Числа");
        for (int a:array) {
            System.out.print(a+",");
        }
        int iMax=0;
        for (int i=0; i<array.length; i++)
            if (array[i]>array[iMax]) {
                iMax=i;
            }
        System.out.println("index:"+iMax+";value:"+array[iMax]);
    }
}
/*Массивы:4задание
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int N=sc.nextInt();
        while (N <= 0) {
            System.out.println("Введите ещё раз, положительное целое число");
            N=sc.nextInt();
        }

        int[] array=new int[N];
        System.out.println("Нижний диапозон значения");
        int Amin=sc.nextInt();

        System.out.println("Верхний диапозон значения");
        int Bmax=sc.nextInt();
        while (Bmax <= Amin) {
            System.out.println("Верхняя граница не может быть равна или меньше нижней, введите новое число");
            Bmax=sc.nextInt();
        }

        for (int i=0; i < array.length; i++) {
            array[i]=(int) ((Math.random()*(Bmax-Amin))+Amin);
        }
        System.out.println("Числа до сортировки");
        for (int a:array) {
            System.out.print(a+",");
        }
        System.out.println();
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length-i-1; j++) {
                if (array[j]>array[j+1]) {
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        System.out.println("Числа после сортировки");
        for (int j:array) {
            System.out.print(j+",");
        }
    }
}

/*Строки:1задание
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str=sc.nextLine();
        char[] strArr = str.toCharArray();
        System.out.println("Введите символ");
        String simvol=sc.nextLine();
        char[] simvolArr = simvol.toCharArray();
        int a = 0;
        for (char i : strArr) {
            if (i == simvolArr[0]) {
                a++;
            }
        }
        System.out.println("Cимвол " + simvolArr[0] + " " + a + " раз встречается в строке ");
    }
}
/*Строки:2задание
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str=sc.nextLine();
        while (str.isEmpty()) {
            System.out.println("Введите ещё раз, строку");
            str=sc.nextLine();
        }
        char[] strArr = str.toCharArray();

        System.out.println("Введите символ a:");
        String simvol1=sc.nextLine();
        char[] simvol1Arr = simvol1.toCharArray();

        System.out.println("Введите символ b:");
        String simvol2=sc.nextLine();
        char[] simvol2Arr = simvol2.toCharArray();

        System.out.print("Новая строка:");
        for (char i : strArr) {
            if (i == simvol1Arr[0]) {
                System.out.print(simvol2Arr[0]);
            }else {
                System.out.print(i);
            }
        }
    }
}