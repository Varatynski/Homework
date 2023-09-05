import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        Reader[] readers = new Reader[10]; //Максимум 10 читателей

        do {
        System.out.println("1 - Добавить нового читателя");
        System.out.println("2 - Читатель хочет взять книгу");
        System.out.println("3 - Читатель хочет вернуть книгу");
        System.out.println("4 - Вывести статус читателя");
        System.out.println("5 - Вывести статусы всех читателей");
        System.out.println("6 - Выйти из программы");
        System.out.println("Введите номер действия: ");
        action = scanner.nextInt();
        scanner.nextLine();

            switch (action) {
                case 1: {
                    boolean isFull = true; //максимальное количество читателей
                    for (int i = 0; i < readers.length-1; i++){
                        if (readers[i] == null) {
                            System.out.print("Введите ФИО читателя: ");
                            String surname =  scanner.nextLine();
                            isFull = false;
                            break;
                        }
                    }
                    if (isFull){
                        System.out.println("Количество читателей уже максимальное");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Введите имя автора:");
                    String authorName = scanner.nextLine();
                    System.out.println("Введите название книги:");
                    String title = scanner.nextLine();
                    System.out.println("Введите номер читательского билета: ");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i=0; i< readers.length-1; i++){
                        if (readers[i] != null && readers[i].getBilet() == readerNumber){
                            found = true;
                            break;
                            }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Введите название книги: ");
                    String name =  scanner.nextLine();
                    System.out.print("Введите номер читательского билета: ");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i=0; i< readers.length-1; i++){
                        if (readers[i] != null && readers[i].getBilet() == readerNumber){
                            found = true;
                            break;
                           }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер читательского билета: ");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i <readers.length; i++) {
                        if (readers[i] != null && readers[i].getBilet() == readerNumber) {
                            readers[i].PrintStatus();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 5:{
                    boolean found = false;
                    for (int i = 0; i < readers.length-1; i++){
                        if (readers [i]== null){
                            Reader.PrintStatus(readers[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.print("Не заведено ни одного читателя");
                    }
                    break;
                }

                case 6: {
                    System.out.println("Завершаем программу");
                    break;
                }
                default: {
                    System.out.println("Нет такой команды");
                }
            }
        } while (action != 6);
    }
}