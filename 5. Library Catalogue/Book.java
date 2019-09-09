package com.Criss75;

/**
 * Represents a book from a library
 * Books can be of different types (Art albums, novels)
 */
public class Book {

    /**
     * The name and number of pages for a book
     */
    private String name;
    private int numOfPages;

    /**
     *
     * @param name sets name of the book
     * @param numOfPages sets number of pages
     */
    public Book(String name, int numOfPages) {
        this.name = name;
        this.numOfPages = numOfPages;
    }

    /**
     *
     * @return return book's name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name sets book's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return number of pages for book
     */
    public int getNumOfPages() {
        return numOfPages;
    }

    /**
     *
     * @param numOfPages sets number of pages
     */
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    /**
     *
     * @return returns the name and number of pages
     */
    @Override
    public String toString() {
        return "\n"+ this.name + ", " + this.numOfPages;
    }
}
