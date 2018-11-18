package enums;

public enum HeaderMenu {

    HOME("Home"),
    CONTACT_FORM("Contact Form"),
    SERVICE("Service"),
    METALS_COLORS("Metals & Colors");

    private String title;

    HeaderMenu(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title.toUpperCase();
    }

}
