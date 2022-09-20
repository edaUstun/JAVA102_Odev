package Java102;

import Java102.Encapsulation.Book;
import Java102.Static.User;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        /*
        Static Kod Blogu

        User u1 = new User("Mustafa");
        User u2 = new User("Patika");
        User u3 = new User("Kalamar");

        System.out.println(User.counter);

         */

        Book harryPotter = new Book("Harry Potter", 154);
        Book lordOfTheRings = new Book("Lord Of the Rings", -100);
        /*
        lordOfTheRings.setName("ABC");

        System.out.println(lordOfTheRings.getName());
         */

        System.out.println(lordOfTheRings.getPageNumber());



    }
}
