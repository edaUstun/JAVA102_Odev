package Java102.Nested;

public class Main {

    public static void main(String[] args) {

        /*

        Nested Class (ic ice siniflar)

            - Inner Class (ic siniflar)
                - static
                - non-static

            - Local Class (yerel siniflar)

            - Anonymous Class (Anonim Siniflar)
        */


        //Out out = new Out();
       // out.run();

        //         In in = new In();
        // direkt olarak bir erisim saglanamaz


        // Ancak out class' dan erisim saglana bilir
        // new kismina out nesnesi ile erisim saglanir
        // Out.In in = out.new In();
        // in.run();

        Local l = new Local();
        l.run();
    }
}
