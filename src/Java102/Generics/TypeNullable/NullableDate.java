package Java102.Generics.TypeNullable;

import java.util.Date;

public class NullableDate {

    private final Date value;

    public NullableDate(Date value) {
        this.value = value;
    }

    public Date getValue() {
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
