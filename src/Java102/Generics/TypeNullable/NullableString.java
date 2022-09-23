package Java102.Generics.TypeNullable;

public class NullableString {

    private String value;

    public String getValue() {
        return this.value;
    }

    public NullableString(String value) {
        this.value = value;
    }


    // method
    public boolean isNull() {
        return value == null;
    }

    @Override
    public String toString() {
        return isNull() ? "null" : value;
    }
}

