package typ.wyliczeniowy_enum;

enum Pizza {
    MARGHERITA("tomato sauce", "cheese"), CAPRICIOSA("tomato sauce", "cheese", "mushrooms"), PROSCIUTTO("tomato sauce", "cheese", "ham");

    private String ingredientOne;
    private String ingredientTwo;
    private String ingredientThree;

    Pizza(String ingredientOne, String ingredientTwo) {
        this.ingredientOne = ingredientOne;
        this.ingredientTwo = ingredientTwo;
    }

    Pizza(String ingredientOne, String ingredientTwo, String ingredientThree) {
        this.ingredientOne = ingredientOne;
        this.ingredientTwo = ingredientTwo;
        this.ingredientThree = ingredientThree;
    }

    public String getDescription() {
        if (ingredientThree != null) {
            return ingredientOne + ", " + ingredientTwo + ", " + ingredientThree;
        } else {
            return ingredientOne + ", " + ingredientTwo;
        }

    }

    @Override
    public String toString() {
        return "Pizza " + name() + " has the following ingredients " + getDescription();
    }
}
