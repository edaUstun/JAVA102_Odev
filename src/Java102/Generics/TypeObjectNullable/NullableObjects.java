package Java102.Generics.TypeObjectNullable;

public class NullableObjects {

    // Object tipinde tanimlarsak degiskenimizi.
    // Tum degiskenlerde kullanabiliriz. Ve hepsi icin
    // tek tek class olusturmak zorunda kalmayiz.

    private final Object value;

    public NullableObjects(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public boolean isNull() {
        return value == null;
    }

    @Override
    public String toString() {
        return isNull() ? "null" : value.toString();
    }
}
