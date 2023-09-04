import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Phone p1=new Phone();
        p1.model = "Realmec55";
        p1.weight = 200.5;
        p1.number = 297773388;
        System.out.println("Модель: " + p1.model + "; вес: " + p1.weight + "гр.; номер мобильный: " + p1.number);

        Phone p2=new Phone();
        p2.model = "Samsung s10 lite";
        p2.weight = 223;
        p2.number = 293548888;
        System.out.println("Модель: " + p2.model + "; вес: " + p2.weight + "гр.; номер мобильный: " + p2.number);

        Phone p3=new Phone();
        p3.model = "Samsung S9 note";
        p3.weight = 200;
        p3.number = 296618833;
        System.out.println("Модель: " + p3.model + "; вес: " + p3.weight + "гр.; номер мобильный: " + p3.number);

        // 4-Вызываем методы receiveCall и getNumber
        p1.receiveCall("Сергей");
        p1.getNumber(p1.number);

        p2.receiveCall("Вадим");
        p2.getNumber(p2.number);

        p3.receiveCall("Павел");
        p3.getNumber(p3.number);

        //9-вызываем перегруженный метод receiveCall
        p1.receiveCall("Сергей", p1.number);
        p2.receiveCall("Вадим", p2.number);
        p3.receiveCall("Павел", p3.number);

        //10-создаем метод sendMessage переменной длины
        p1.sendMessage(p1.number);
        p2.sendMessage(p2.number);
        p3.sendMessage(p3.number);
    }
}