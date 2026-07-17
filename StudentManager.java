import java.util.Scanner;

class Student {
    String name;
    int age;
    double cgpa;

    Student(String name,int age,double cgpa){
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
}

public class StudentManager{

    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      Student[] student = new Student[100];
      int count =0;

      System.out.println("Enter Name");
      String name=sc.nextLine();

      System.out.println("Enter age");
      int age = sc.nextInt();

      System.out.println("Enter CGPA");
      double cgpa = sc.nextDouble();
 
    student[count]=new Student(name, age, cgpa);
    count++;

     System.out.println("\nStudent Added Successfully!");

     System.out.println(student[0].name);
     System.out.println(student[0].age);
     System.out.println(student[0].cgpa);
     sc.close();

    }
}


