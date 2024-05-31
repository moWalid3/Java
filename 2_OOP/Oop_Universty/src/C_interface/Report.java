package C_interface;

public interface Report {
    // interface is ==> action and "has-a" relationship

    // instance variable in interface by default ==> public static final
    String reportTo = "Manager";

    // methods by default ==> public abstract
    void printReport();

}
