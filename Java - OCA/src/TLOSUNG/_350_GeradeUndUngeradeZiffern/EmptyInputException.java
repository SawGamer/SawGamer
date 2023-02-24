package TLOSUNG._350_GeradeUndUngeradeZiffern;

class EmptyInputException extends NumberFormatException {
    EmptyInputException() {
        super();
    }

    EmptyInputException(String str) {
        super(str);
    }
}
