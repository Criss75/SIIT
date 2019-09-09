package com.Criss75;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Book> books =new ArrayList<>();
        books.add (new Novel("Razboi si pace", 234, "Razboi"));
        books.add (new ArtAlbum("Everest", 34, "High"));

        List<Novel> novels = new ArrayList<>();
        List<ArtAlbum> artAlbums = new ArrayList<>();

        LibraryCatalog mylib = new LibraryCatalog(novels,artAlbums);


        System.out.println(books);
    }
}
