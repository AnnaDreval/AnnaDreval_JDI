package enums;

public enum Results {

    SUM("Summary: "),
    ELEM("Elements: "),
    COLOR("Color: "),
    METAL("Metal: "),
    VEG("Vegetables: ");

    public String title;

    Results(String title) {
        this.title = title;
    }

}
