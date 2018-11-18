package enums;

public enum Metals {

    GOLD(0, "Gols"),
    SILVER(1, "Silver"),
    BRONZE(2, "Bronze"),
    SELEN(3, "Selen");

    private int number;
    private String title;

    Metals(int number, String title) {
        this.number = number;
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }


}
