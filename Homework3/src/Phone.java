public class Phone {
    String model;
    double weight;
    int number;

          // 4-Вызываем методы receiveCall и getNumber
    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    void getNumber(int number){
        System.out.println(number);
    }

          // 5-конструктор принимает на вход три параметра
          // 8-конструктора с тремя параметрами вызвали конструктор с двумя
    public Phone (int number, String model, double weight){
        this(number,model);
        this.weight = weight;
    }

          // 6-конструктор принимает на вход два параметра number model
    public Phone (int number, String model){
        this.number = number;
        this.model = model;
    }
          // 7-конструктор без параметров
    public Phone(){}

       // 9-перегруженный метод recieveCall
    public void receiveCall(String name, int number){
        System.out.println(name +" "+ number);
    }

           // 10-создаем метод sendMessage переменной длины
    public void sendMessage(int... numbers){
    System.out.println("Сообщение на номер:"+ number);
}

}

