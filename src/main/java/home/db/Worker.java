package home.db;

/**
 * Created by Козак on 10.11.2016.
 */
public class Worker {

    private int id;
    private String name;
    private String email;
    private int age;

    public Worker() {}

    public Worker(String name) {
        this.name = name;
    }

    public Worker(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker: { "+id+"\t"+name+"\t"+age+" years old\t"+email+" }";
    }
}
