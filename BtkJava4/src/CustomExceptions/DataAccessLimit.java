package CustomExceptions;

public class DataAccessLimit extends Exception{

    @Override
    public String getMessage() {
        return "Your data access permission reached to limit";
    }

    @Override
    public String toString() {
        return "Created for managing data access management";
    }
}
