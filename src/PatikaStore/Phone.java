package PatikaStore;

import java.util.ArrayList;

public class Phone extends Product{

    private static int pId=1;
    private int battery;
    private String color;
    private int camResolution;
    private static ArrayList<Phone> phones = new ArrayList<>();

    public static int getpId() {
        return pId;
    }

    public static void setpId(int pId) {
        Phone.pId = pId;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCamResolution() {
        return camResolution;
    }

    public void setCamResolution(int camResolution) {
        this.camResolution = camResolution;
    }

    public Phone(){}
    public Phone(String name, double price, int discountRate, int amount,
                       Brand brand, double screenSize, int ram, int memory,
                       int battery, String color, int camResolution) {
        super(pId,name, price, discountRate, amount, brand, screenSize, ram, memory);
        pId++;
        this.battery=battery;
        this.color=color;
        this.camResolution=camResolution;
    }


    @Override
    public void menu() {
        System.out.println("1- Yeni Telefon ekle\n" +
                "2- Telefon listesini görüntüle\n" +
                "3- Telefon sil\n" +
                "4- Telefonlari id numaralarına göre sırala");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        int value=scanner.nextInt();
        if(value==1) addItem();
        if(value==2 || value==4) getProducts();
        if(value==3) deleteItem();
    }

    @Override
    public void addItem() {

        System.out.println("Urun Fiyat (TL) : ");
        double price = scanner.nextDouble();
        System.out.println("Urun Adi : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Urun Indirim Orani : ");
        int discountRate = scanner.nextInt();
        System.out.println("Urun Stogu : ");
        int amount = scanner.nextInt();
        System.out.println("Urun Rami : ");
        int ram = scanner.nextInt();
        System.out.println("Urun Ekrani : ");
        double screenSize = scanner.nextDouble();
        System.out.println("Urun Hafizasi : ");
        int memory = scanner.nextInt();
        System.out.println("Urun Pili : ");
        int battery = scanner.nextInt();
        System.out.println("Urun Rengi : ");
        scanner.nextLine();
        String color = scanner.nextLine();
        System.out.println("Kamera Cozunurluk : ");
        int camResolution = scanner.nextInt();
        Brand.printBrands();
        System.out.println("Marka Seciniz : ");
        Brand brand = Brand.getBrand(scanner.nextInt());


        Phone phone=new Phone(name,price,discountRate,amount,brand,screenSize,ram,memory,battery,color,camResolution);
        phones.add(phone);

        System.out.println("Eklenen telefon id : " + phone.getId());


    }

    @Override
    public void getProducts() {
        print(null);
    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.println("Silinmek istenen Telefon ID : ");
        int id = scanner.nextInt();
        phones.remove(id-1);

        System.out.println("Guncel Telefon Listesi");
        getProducts();
    }


    // extra

    public void print(ArrayList<Phone> phoneArrayList) {

        if (phoneArrayList==null) {
            phoneArrayList = this.phones;
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Pil Kapasitesi  | Renk           | Kamera    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Phone phone : phoneArrayList) {
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s | \n",
                    phone.getId(),phone.getName(),phone.getPrice(),phone.getBrand().getName(),phone.getAmount(),
                    phone.getDiscountRate(),phone.getRam(),phone.getScreenSize(),phone.getMemory(),phone.getBattery(),phone.getColor(),phone.getCamResolution());
        }
    }
}
