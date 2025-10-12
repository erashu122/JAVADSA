package DAS_WITH_JAVAADD.OOPS_IN_JAVA.oppsbykunal;

import java.util.*;
public class first{
    public static void main(String [] args){
        Student ashu=new Student();
        System.out.println(ashu.roln);

    }
    static class Student{
        int roln;
        String name ;
        float marks;

        Student(){
            this.name="Ashutosh kumar pandit ";
            this.roln=1;
            this.marks=90.87f;
        }
    }
}