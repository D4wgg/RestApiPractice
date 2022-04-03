package ru.dawgg.bookmarket.exception;

import java.util.function.Supplier;

public class InnerApiException extends RuntimeException implements Supplier<InnerApiException> {

    public static final String USER_NOT_FOUND_EXCEPTION = "User is not found";
    public static final String BOOK_NOT_FOUND_EXCEPTION = "Book is not found";

    public InnerApiException(String message) {
        super(message);
    }

    public InnerApiException() {}

    @Override
    public InnerApiException get() {
        return new InnerApiException();
    }
}
