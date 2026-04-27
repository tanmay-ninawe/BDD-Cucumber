package cucumberOptions;

public class Parent {
    public static void main(String[] args) {
        System.out.println("This is the parent class");


        // Calling the child class method to test the inheritance
        Child child = new Child();
        child.test();


        System.out.println("This is the parent class calling the child class method to test the inheritance");

        //calling the second child class method to test the inheritance
        childTwo c2 = new childTwo();
        c2.secondChild();
    }
}
        