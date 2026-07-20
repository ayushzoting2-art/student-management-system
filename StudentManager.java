import java.util.ArrayList;
import java.util.Scanner;


class Student {
    int id; 
    String name;
    int age;
    double cgpa;

    Student(int id,String name,int age,double cgpa){
        this.id=id;
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
}

public class StudentManager{

    public static void main(String[] args) {
      int choice;
      Scanner sc=new Scanner(System.in);
      ArrayList<Student> student = new ArrayList<>();

      
   

      while(true){
      System.out.println("=========================");
      System.out.println("     STUDENT MANAGER       "); 
      System.out.println("========================="); 
      System.out.println("Enter choice");
      System.out.println("1 To add student\n2 To delete\n3 To view all students.\n4 To exit");
      choice = sc.nextInt();
      
     
      switch (choice) {
      case 1:
      System.out.println("Enter ID");
      int id =sc.nextInt();
      sc.nextLine();

      System.out.println("Enter Name");
      String name=sc.nextLine();

      System.out.println("Enter age");
      int age = sc.nextInt();

      System.out.println("Enter CGPA");
      double cgpa = sc.nextDouble();

      student.add(new Student(id, name, age, cgpa));

 
    

      
      System.out.println("\nStudent Added Successfully!");
            break;


      
        case 2:
    if (student.isEmpty()) {
        System.out.println("Not Student to Delete");
        break;
    }

    System.out.println("Enter Student ID to be removed:");
    int toremove = sc.nextInt();

    boolean found=false;
    for(int i=0;i<student.size();i++){
        if(student.get(i).id==toremove){
            student.remove(i);
            found=true;
            System.out.println("Removed student succesfully");
            break;
        }
    }

    if (!found) {
        System.out.println("Student not found");
    }
          
  
        break;
            



        
        case 3:

        if (student.isEmpty()) {
            System.out.println("No student present");
        }

        else{ 
            System.out.println("--------Student List--------");
            for(int i=0;i<student.size();i++){
                Student s = student.get(i);
                System.out.println(s.name);
                System.out.println(s.age);
                System.out.println(s.cgpa);
                System.out.println("--------------------------");
            }
        }
            break;
        



        case 4:
            System.out.println("Thank You");
               sc.close();
            return;

        default:
            System.out.println("Enter a valic choice");
            break;
      }
    


     
    }

    }
}


