class Unit {
    private int a;
    private String b;
    public Unit(int a, String b) {
        this.a = a;
        this.b = b;
    }
    public Unit(Unit newUnit) {
        this.a = newUnit.a;
        this.b = newUnit.b;
    }
    public void printInfo() {
        System.out.println("Name: " + b);
        System.out.println("Health: " + a);
    }
}
class Mage extends Unit {
    private int c;
    public Mage(int a, String b, int c) {
        super(a, b);
        this.c = c;
    }
    public Mage(Mage newMage) {
        super(newMage);
        this.c = newMage.c;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana: " + c);
    }
}
public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit(0, "4й цилиндр в sti");
        unit.printInfo();

        Mage mage = new Mage(80, "tsi", 50);
        mage.printInfo();
    }
}
//Класс – это шаблон или описание, определяющее состояние и поведение объектов, которые на его основе создаются.
//Объект – это экземпляр класса, созданный на основе его описания. ( ну всмысле на основе описания класса)
//
// Наследование: Наследование позволяет классу наследовать атрибуты и методы другого класса. (подкласс наследует у суперкласса)
// Инкапсуляция: Инкапсуляция – приватность данных и методов, доступ к данным ограничивается и может осуществляться только через методы класса, короче для защиты данных
// Полиморфизм: один и тот же метод может иметь разные реализации для разных классов. позволяет программисту работать с объектами разных типов, используя общие методы
//
// public: Поля и методы с модификатором доступа public доступны для всех классов и методов
// private: Поля и методы с модификатором доступа private доступны только внутри класса
// protected: Поля и методы с модификатором доступа protected доступны внутри класса, внутри пакета и в наследующих классах (наслед классы могут быть и в других пакетах)
// default: Поля и методы доступны только внутри пакета