package edu.rusbellruiz.quarrylevel2workshop1;

import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase se usó para probar la correcta funcionalidad de cada una de las clases
 * perteneciente a este mismo Package(BankAccount, Bicycle, Birds, Fruit, Person, User).
 */
public class Main {
    public static void main(String[] args){
        Person p1 = new Person("Rusbell","Ruiz","portocarrero", "17/09/1993)", 180);
        System.out.println(p1.toString());
        //Fruit f1 = new Fruit("Manzana", 120,"rojo");
        //f1.setColor("verde");
        //f1.setColor("amarillo");
        //System.out.println(f1.toString());
        //BankAccount b1 = new BankAccount(100213,true);
        //b1.setActived(true);
        //System.out.println(b1.getActived());
        //Birds bird1 = new Birds("picaflor",15,20.5);
        //System.out.println(bird1.toString());
        //User us1 = new User("rusbell","12er");
        //us1.username= "carlos";
        //us1.setPassword("er21");
        //us1.greet();
        //System.out.println("mi password es: " + us1.getPassword());



    }
}