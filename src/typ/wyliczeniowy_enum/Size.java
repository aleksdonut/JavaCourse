package typ.wyliczeniowy_enum;

enum Size {
    XSMALL("Bardzo maly"), SMALL("Maly"), MEDIUM("Sredni"), LARGE("Duzy");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Size fromDescription(String description) {
        Size[] values = values();
        for (Size size : values) {
            if (size.getDescription().equals(description))
                return size;
        }
        return null;
    }

    @Override
    public String toString() {
        return description + " " + name() + " " + ordinal();
    }
}
