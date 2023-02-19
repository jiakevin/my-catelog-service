package com.polarbookshop.catalogservice.domain;

/**
 * @author jiakevin
 * @since 2023-01-19 20:59
 */
public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
