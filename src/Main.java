public class Main {
    public static void main(String[] args) {

        //4 создаем объект, далее вызываем методы для объекта
        //при вызове выводится текст спит сидит отдыхает
        IBed to_do = new AdapterActions();

        to_do.sleep();
        to_do.sit();
        to_do.rest();
    }
}