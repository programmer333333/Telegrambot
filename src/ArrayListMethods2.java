import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
Student st1 = new Student("Andrey", 'm',44, 5, 9.7);
Student st2 = new Student("Bob", 'm',43, 4, 9.5);
Student st3 = new Student("Sergey", 'm',40, 2, 7.4);
Student st4 = new Student("Petr", 'm',23, 2, 6.5);
Student st5 = new Student("Nikolay", 'm',37, 3, 7);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;


    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}