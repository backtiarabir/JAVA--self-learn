//package first_class;

class Student {
    int id;
    String name, semester;
    char sec;

    void setmethod(int i, String n, String sem, char s) {
        id = 1;
        name = n;
        semester = sem;
        sec = 'A';
    }

    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(semester);
        System.out.println(sec);
    }
}

public class ilhamstring {
    public static void main(String args[]) {
        Student s1 = new Student();

        s1.id = 10;
        s1.name = "abir";
        s1.semester = "5th";
        s1.sec = 'A';

        s1.setmethod(10, "abir", "5th", 'A');
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.semester);
        System.out.println(s1.sec);

        s1.display();
    }
}
