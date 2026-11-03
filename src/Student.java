import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public int compareTo(Student st) {
        return age-st.age;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Mimi", 23));
        students.add(new Student("Ahmed", 18));
        students.add(new Student("Timo", 32));
        System.out.println(students);

        students.sort(null);
        System.out.println(students);
    }
}