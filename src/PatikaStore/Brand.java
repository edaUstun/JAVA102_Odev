package PatikaStore;

import java.util.*;

public class Brand {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Brand() {}


    private static TreeSet<Brand> brandTreeSet = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand b1, Brand b2) {
            return b1.getName().compareTo(b2.getName());
        }
    });

    static {
        createBrands();
    }


    public static void createBrands() {
        brandTreeSet.add(new Brand(1,"Samsung"));
        brandTreeSet.add(new Brand(2,"Lenovo"));
        brandTreeSet.add(new Brand(3,"Apple"));
        brandTreeSet.add(new Brand(4,"Huawei"));
        brandTreeSet.add(new Brand(5,"Casper"));
        brandTreeSet.add(new Brand(6,"Asus"));
        brandTreeSet.add(new Brand(7,"HP"));
        brandTreeSet.add(new Brand(8,"Xiaomi"));
        brandTreeSet.add(new Brand(9,"Monster"));
    }


    public static void printBrands() {
        System.out.println("Marka Listesi");
        System.out.println("----------------------------");
        for (Brand brand : brandTreeSet) {
            System.out.println("- "+brand.getName() + " " + brand.id);
        }
    }

    // id
    public static Brand getBrand(int id) {
        for (Brand b : brandTreeSet) {
            if(id==b.getId()){
                return b;
            }
        }
        return null;
    }



}

/*

 */


/*

package PatikaStore;

import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Brand() {}

    @Override
    public int compareTo(Brand brand) {
        return this.getName().compareTo(brand.getName());
    }

    TreeSet<Brand> brand = new TreeSet<>();

    public void Brands() {
        brand.add(new Brand(1,"Lenovo"));
        brand.add(new Brand(2,"Apple"));
        brand.add(new Brand(3,"Xiaomi"));
        brand.add(new Brand(4,"Casper"));
        brand.add(new Brand(5,"HP"));
        brand.add(new Brand(6,"Huawei"));
        brand.add(new Brand(7,"Monster"));
        brand.add(new Brand(8,"Samsung"));
        brand.add(new Brand(9,"Asus"));
    }


    public void brandPrint() {
        System.out.println("Marka Listesi ");
        for (Brand brand : brand) {
            System.out.println(brand.id + " " + brand.getName());
        }
        System.out.println("----------------------------");
    }

}

 */