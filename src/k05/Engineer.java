package k05;

public class Engineer extends Employee {
    private String projectName;

    public Engineer(String id, String name) {
        super(id, name);
    }

    public Engineer(String id, String name, String projectName) {
        super(id, name);
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void printEnineer() {
        System.out.println("ID : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("ProjectName : " + projectName);
    }
}
