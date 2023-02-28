package com.github.arthurcech.employeesmanagement.controller.exception;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private final List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(
            Instant timestamp,
            Integer status,
            String error,
            String message,
            String path
    ) {
        super(timestamp, status, error, message, path);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String field, String message) {
        errors.add(new FieldMessage(field, message));
    }

}
