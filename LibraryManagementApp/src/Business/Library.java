/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Material.AuthorDirectory;
import Material.BookDirectory;
import Material.GenreDirectory;
import Material.MagazineDirectory;

/**
 *
 * @author Prasad
 */
public class Library {
    private int buildingNumber;
    private BookDirectory books;
    private MagazineDirectory magazines;
    private AuthorDirectory authors;
    private GenreDirectory genres;

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public BookDirectory getBooks() {
        return books;
    }

    public void setBooks(BookDirectory books) {
        this.books = books;
    }

    public MagazineDirectory getMagazines() {
        return magazines;
    }

    public void setMagazines(MagazineDirectory magazines) {
        this.magazines = magazines;
    }

    public AuthorDirectory getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorDirectory authors) {
        this.authors = authors;
    }

    public GenreDirectory getGenres() {
        return genres;
    }

    public void setGenres(GenreDirectory genres) {
        this.genres = genres;
    }
    
}
