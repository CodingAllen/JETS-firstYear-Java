package k07;

import java.util.Objects;
import java.util.Scanner;

public class Kadai0703 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store s;

        System.out.print("Select(FIFO or LIFO)--->");
        String type = scan.next();

        if ("FIFO".equals(type)) {
            s = new FifoStore();
        } else {
            s = new LifoStore();
        }

        while (true) {
            System.out.print("Select(Put or Get or End)--->");
            String opr = scan.next();
            if (Objects.equals(opr, "End")) break;
            else {
                if ("Put".equals(opr)) {
                    System.out.print("No--->");
                    int no = scan.nextInt();
                    System.out.print("Name--->");
                    String name = scan.next();
                    putUser(s, no, name);
                }
                if ("Get".equals(opr)) {
                    getUser(s);
                }
            }
        }
    }

    static void putUser(Store s, int no, String name) {
        User u = new User(no, name);
        s.put(u);
    }

    static void getUser(Store s) {
        User fu = (User)s.get();
        if (fu == null) {
            System.out.println("data empty!");
            return;
        }
        int currIndex = s.size();
        System.out.println(fu.getNo() + "  " + fu.getName());
        System.out.println("Store size: " + s.size());
    }
}

class Store {
    protected Object[] data = new Object[5];
    protected int index;

    public void put(Object value) {
        if (this.index == 5) {
            System.out.println("Overflow");
        } else {
            data[this.index] = value;
            this.index++;
        }
        System.out.println("Store size: " + this.index);
    }

    public int size() {
        return this.index;
    }

    public Object get() {
        return data;
    }
}

class FifoStore extends Store{
    public Object get() {
        if(this.index == 0) {
            return null;
        } else {
            Object tmp = this.data[0];
            for (int i = 0; i < this.index && i < 4; i++) {
                this.data[i] = this.data[i + 1];
            }
            this.data[this.index - 1] = null;
            this.index--;
            return tmp;
        }
    }
}

class LifoStore extends Store{
    public Object get() {
        if(this.index == 0) {
            return null;
        } else {
            Object tmp = this.data[this.index - 1];
            this.data[this.index - 1] = null;
            this.index--;
            return tmp;
        }
    }
}

class User{
    private int no;
    private String name;

    User() {}

    User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }
}
