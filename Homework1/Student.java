public abstract class Student {
    private String _firstName;
    private String _lastName;
    private int _id;

    public abstract void init(String firstName, String lastName, int id);
    public abstract int getId();
    public abstract String getName();
}
