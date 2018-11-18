package enums;

public enum Colors {

    RED("Red"),
    GREEN("Green"),
    BLUE("BLUE"),
    YELLOW("Yellow");

    private String title;

    Colors(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
