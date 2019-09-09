package com.Criss75;

/**
 * Represents the art albums from a library
 */
public class ArtAlbum extends Book {
    private String paperQuality;

    /**
     *
     * @param name this art albums's name
     * @param numOfPages this art album's number of pages
     * @param paperQuality this art album paper quality
     */
    public ArtAlbum(String name, int numOfPages, String paperQuality) {
        super(name, numOfPages);
        this.paperQuality = paperQuality;
    }

    /**
     *
     * @return returns paper quality for art album
     */
    public String getPaperQuality() {
        return paperQuality;
    }

    /**
     *
     * @param paperQuality sets paper quality for an art album
     */
    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    /**
     *
     * @return returns name, number of pages and paper quality for an art album
     */
    @Override
    public String toString() {
        return "\n" + super.toString() + ", " + paperQuality;
    }
}
