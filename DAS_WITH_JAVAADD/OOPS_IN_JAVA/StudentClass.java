package DAS_WITH_JAVAADD.OOPS_IN_JAVA;

public class StudentClass {
    // creating a new data type
    public static class Student{
        String name;
        int rollno;
        double percent;
    }
    public static void main(String[] args) {
        Student x=new Student();
        x.name="ashutosh";
        x.rollno=34;
        x.percent=78.3;
        System.out.println(x.percent + 10);
        System.out.println(x.rollno);

    }
}
