package kolejki;

enum Priority {
    LOW("Low"), MODERATE("Medium"), HIGH("High");

    String description;

    Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Priority fromDescription(String description) {
        Priority[] values = values();
        for (Priority priority : values) {
            if (priority.getDescription().equals(description))
                return priority;
        }
        return null;
    }
}
