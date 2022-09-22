package Java102.Nested;

// ic class disindaki class' an this ile erisim saglaya bilir.
// fakat out class in class' an erisebilmek icin nesne tanimlanarak erisim saglayabilir.
public class Out {

    public int a = 5;


    // inner class
    public class In {

        public int a = 10;

        public void run() {
            System.out.println("In sinifina ait run metodu calisti.");
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }

    public void run() {
        In in = new In();

        System.out.println("Out sinifina ait run metodu calisti.");
        //in.run();
    }

}
