package test;

public class Test {
    public static void main(String[] args) {

        Parent obj = new Parent();
        obj.greet();

    }
}



    class Parent {
         void greet() {
            System.out.println("Parent: greet");
        }
    }

    class Child extends Parent {
        void greet() {
            System.out.println("Child: greet");
        }
    }




