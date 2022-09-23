package Java102.Generics.GenericInterface;

public class Student<T> implements IDatabase<T>{


    @Override
    public boolean insert(T data) {
        System.out.println(data + " Eklendi");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Silindi");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println(data + " Guncellendi");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Veri Cekildi");
        return null;
    }
}
