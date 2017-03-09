import java.util.Date;

enum MyEnum {
    THIS_MY(),
    THIS_HER,
    THIS_HIS;

    String color;

    MyEnum() {
        color = "dd";
    }

    MyEnum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
