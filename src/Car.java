public class Car {

    void drivecCar(){
        System.out.println("Car is Driving!");

    }
}

class Audi extends Car{
    public void driveAudi(){
        System.out.println("Audi is Driving!");
    }
}
class Mercedez extends Car{
    public void driveMercedez(){
        System.out.println("Mercedez is Driving");

    }
}
class BMW extends Car{
    public void  driveBMW(){
        System.out.println("BMW is Driving1");

    }
}

class Test2{
    public static void main(String[] args) {
        Audi a= new Audi();
        a.driveAudi();
        a.drivecCar();

        Mercedez m=new Mercedez();
        m.driveMercedez();
        m.drivecCar();

        BMW b=new BMW();
        b.driveBMW();
        b.drivecCar();

    }
}