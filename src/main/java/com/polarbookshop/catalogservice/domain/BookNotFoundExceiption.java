package com.polarbookshop.catalogservice.domain;

/**
 * @author jiakevin
 * @since 2023-01-19 21:14
 */
public class BookNotFoundExceiption extends RuntimeException{
    public BookNotFoundExceiption(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
