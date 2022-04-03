package ru.dawgg.bookmarket.exception;

import java.util.function.Supplier;

public class InnerApiException extends RuntimeException implements Supplier<InnerApiException> {

    public static final String USER_NOT_FOUND_EXCEPTION = "User not found";

    public InnerApiException(String message) {
        super(message);
    }

    public InnerApiException() {}

    @Override
    public InnerApiException get() {
        return new InnerApiException();
    }
}
