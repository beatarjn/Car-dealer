package dealer;

import java.util.NoSuchElementException;

public enum Option {

    EXIT(0, "Exit program"),
    ADD_CAR(1, "Add car"),
    SHOW_CARS(2, "Show available cars"),
    REMOVE_CAR(3, "Remove car from the list"),
    SEARCH_CAR(4, "Search for a car");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String desc) {
        this.value = value;
        this.description = desc;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    public static Option createFromInt(int option) throws NoSuchElementException {
        Option result = null;
        try {
            result = Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException("No such element");
        }

        return result;
    }
}
