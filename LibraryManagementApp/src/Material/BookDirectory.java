/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class BookDirectory {
    private ArrayList<Book> booksList;
    
    public BookDirectory()
    {
        this.booksList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(ArrayList<Book> booksList) {
        this.booksList = booksList;
    }
    
}
