package Java102.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Liste = HashSet - degisken girildikce boyutunu kendisi arttirir.
        HashSet<Integer> hSet = new HashSet<>();

        hSet.add(10);
        hSet.add(20);
        hSet.add(30);

        System.out.println(hSet.size());

        // HashSet - ile bir degisken degeri bir kez yazdirilir
        // Mukerrer kayit yapmaz.
        for(Integer number : hSet) {
            //System.out.println(number);
        }


        // Olusturulan listeleri dolasma
        Iterator<Integer> itr = hSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
