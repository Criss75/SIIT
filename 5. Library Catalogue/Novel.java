package com.Criss75;

/**
 * Represents the novels from a library
 */
public class Novel extends Book {
    private String types;

    /**
     *
     * @param name this novel's name
     * @param numOfPages this novel's number of pages
     * @param types this novel type
     */
    public Novel(String name, int numOfPages, String types) {
        super(name, numOfPages);
        this.types = types;
    }

    /**
     *
     * @return returns type of novels
     */
    public String getTypes() {
        return types;
    }

    /**
     *
     * @param types sets types of novel
     */
    public void setTypes(String types) {
        this.types = types;
    }

    /**
     *
     * @return returns name, number of pages and types for a novel
     */
    @Override
    public String toString() {
        return "\n" + super.toString() + ": " + types;
    }
}
