package Java102.Generics;

import Java102.Generics.GenericMetotlar.Print;
import Java102.Generics.TypeNullable.NullableString;
import Java102.Generics.TypeObjectNullable.NullableObjects;
import Java102.Nested.Out;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /*

        Bu sekilde tum degisken tipleri icin yeni bir class olusturmamiz gerekmektedir.
        NullableString x = new NullableString("null olmayan deger");

        // isNull -> false
        // !isNull -> true ( false degilse )
        if(!x.isNull()) {
            System.out.println(x.getValue());
        }


        String nullString = null;

        NullableString y = new NullableString(nullString);

        // isNull -> false
        if(y.isNull()) {
            System.out.println("y degiskeni null");
        }
         */

        System.out.println("---------------------------------------------");


        /*

        // Tum Degiskenler icin


        // Object tipi ile tum degiskenlere tek bir class ile erisim saglayabiliriz

        //String
        NullableObjects nullableString = new NullableObjects("Abc");
        //Date
        NullableObjects nullableDate = new NullableObjects(new Date());
        //Int
        NullableObjects nullableInt = new NullableObjects(2020);
        //Double
        NullableObjects nullableDouble = new NullableObjects(3.14);
        //Boolean
        NullableObjects nullableBoolean = new NullableObjects(true);


        if(!nullableString.isNull()) {
            String value = (String) nullableString.getValue();
            System.out.println(nullableString.getValue());
        }
        if(!nullableDate.isNull()) {
            Date value = (Date) nullableDate.getValue();
            System.out.println(nullableDate.getValue());
        }
        if(!nullableInt.isNull()) {
            int value = (int) nullableInt.getValue();
            System.out.println(nullableInt.getValue());
        }
        if(!nullableDouble.isNull()) {
            double value = (double) nullableDouble.getValue();
            System.out.println(nullableDouble.getValue());
        }
        if(!nullableBoolean.isNull()) {
            boolean value = (boolean) nullableBoolean.getValue();
            System.out.println(nullableBoolean.getValue());
        }
         */


        // generic method

        String [] a = {"Java", "102", "Patika", "Dev"};
        Integer[] b = {1, 2, 3, 4};
        Character[] c = {'J', 'A', 'V', 'A'};


        Print.printArray(a, "String ");
        System.out.println("---------------------------------------------");
        Print.printArray(b, "Sayilar");
        System.out.println("---------------------------------------------");
        Print.printArray(c, 1);

    }
}
