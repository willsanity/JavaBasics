package day08_Abstract_interface;

//interface is a fully abstract class

// how to create interface

interface Bank{ // we use interface keyword to create interface
       
       //we can't write concrete method in interface
       
       // all the methods are by default public and abstract
       void showCustomer(); //a abstract method
       
       // if you want to declare a variable, then it must be final
       // final means constant, you can't change the value
       int bankCode = 102030;
       
       //we cannot write a concrete method in the interface class
       /*void show(){
              
       }*/
}

/*abstract class Customer implements Bank{
       //abstract void showCustomer(); //Occur error, if you did't write abstract keyword
       //no need to override the abstract method as it is already a abstract class
}*/

class Customer implements Bank{

       @Override
       public void showCustomer() {
              // TODO Auto-generated method stub
              
       }

       
       //The normal class when implement the interface class, need to declare the method
}

public class InterfaceExample01 {

       public static void main(String[] args) {
              // TODO Auto-generated method stub

       }

}





