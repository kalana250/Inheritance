public class Animal {

    String name;

    void eat(){
        System.out.println("I can eat!");
    }
}

class Human extends Animal{
    void show(){
        System.out.println("My name is "+name);
    }
}
class Test{
    public static void main(String[] args) {
        Human kalana=new Human();
        kalana.name="Kalana";
        kalana.show();
        kalana.eat();
    }
}
