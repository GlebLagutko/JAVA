package kr;

public class EnumIncorrectException extends Exception{
    public EnumIncorrectException() {
        super("Incorrect tree type in file !!!");
    }
}
