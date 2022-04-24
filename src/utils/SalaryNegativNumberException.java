package utils;

public class SalaryNegativNumberException extends  RuntimeException{

    public SalaryNegativNumberException(int salary) {
        super("Pensja nie może być ujemna " + salary);
    }
}
