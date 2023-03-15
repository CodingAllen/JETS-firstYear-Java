package k07;

public abstract class Syain {
    private String codeString;
    private String nameString;

    public Syain(String codeString, String nameString) {

        this.codeString = codeString;
        this.nameString = nameString;
    }

    public String getCodeString() {
        return codeString;
    }

    public String getNameString() {
        return nameString;
    }

    abstract void work();

}
