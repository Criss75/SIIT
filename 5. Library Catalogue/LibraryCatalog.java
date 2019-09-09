package com.Criss75;

/**
 * represents the library that contains novels and art albums
 */

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private List<Novel> novels = new ArrayList<>();
    private List<ArtAlbum> artAlbums = new ArrayList<>();

    /**
     * @param novels    this library novels
     * @param artAlbums this library art albums
     */

    public LibraryCatalog(List<Novel> novels, List<ArtAlbum> artAlbums) {
        this.novels.addAll(novels);
        this.artAlbums.addAll(artAlbums);
    }

    /**
     * @return returns the novels from library
     */
    public List<Novel> getNovel() {
        return novels;
    }

    /**
     * @param novel sets the novels from a library
     */
    public void setNovel(List<Novel> novel) {
        this.novels = novel;
    }

    /**
     * @return returns the art albums from a library
     */
    public List<ArtAlbum> getArtAlbum() {
        return artAlbums;
    }

    /**
     * @param artAlbum sets the art albums from a libraty
     */
    public void setArtAlbum(List<ArtAlbum> artAlbum) {
        this.artAlbums = artAlbum;
    }

    /**
     * @param newNovel
     */
    public void addNovel(Novel newNovel) {
        this.novels.add(newNovel);
    }

    public boolean removeNovel(Novel novel) {

        String name = novel.getName();
        novels.remove(novel);

        return novels.remove(novel);
    }

    /**
     * @return returns the details of books
     */
    @Override
    public String toString() {
        return "\n" + super.toString();
    }
}
