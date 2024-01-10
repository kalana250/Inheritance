public class Employee {

    float salary=50000;
}

class JavaProgrammer extends Employee{

    int bonus=50000;

    public static void main(String[] args) {

        JavaProgrammer nilakshi=new JavaProgrammer();
        System.out.println("Java Programmer salary is "+nilakshi.salary);
        System.out.println("Java Programmer Bonus is "+nilakshi.bonus);
        System.out.println("Java Programmer gross salary is "+(nilakshi.bonus+nilakshi.salary));
    }
}