package k05;

public class Employee {
    private String id;
    private String name;
    Employee(String id,String name){
        this.id = id;
        this.name = name;
    }
    String getId() {
        return id;
    }
    String getName() {
        return name;
    }

}
