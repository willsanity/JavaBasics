package day08_Abstract_interface;

interface Country{
       
       //if the variable is constant, we can then declare the variable inside the  interface class
       int countryCode = 2020; //as final is a constant, hence we need to declare the variable, hence the variable is final and static
}

interface MyInterface1{
       void myMethod1();
}

interface MyInterface2{
       void myMethod2();
}

class MyClass1 implements MyInterface1{

       @Override
       public void myMethod1() {
              System.out.println("My method 1");
       }

       MyInterface2 refMyInterface = new MyInterface2() { //Anonymous inner class
              
              @Override
              public void myMethod2() {
                     System.out.println("My method 2");
                     
              }
       };
}

public class InterfaceExample03 {

       public static void main(String[] args) {
              System.out.println(Country.countryCode);
              MyClass1 refClass1 = new MyClass1();
              refClass1.refMyInterface.myMethod2();
              refClass1.myMethod1();

       }

}

