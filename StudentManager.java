import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
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

      
      //Student[] student = new Student[100];
      //int count =0;

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

 
      //student[count]=new Student(id,name, age, cgpa);
      //count++;

      
      System.out.println("\nStudent Added Successfully!");
            break;


      
        case 2:
    

     if (student.isEmpty()) {
           System.out.println("No student to delete");
    
    System.out.println("Enter ID to be removed");
    int toremove=sc.nextInt();

           if (student.contains(toremove)) {
            for(int i=0;i>=student.size();i++){
                if(student.get(i.id=toremove)){
                    student.remove(i);
                    System.out.println("Student Succesfully deleted");
                }
            }
           }
           else
            System.out.println("Enter the id of existing student");
          
    //         }
    //         else{
    //            for (int j = 0; j < count - 1; j++) {
    //         student[j] = student[j + 1];
    //     }
    //     student[count - 1] = null;
    //     count--;
    // }
    //     System.out.println("Student deleted.");
        break;
            



        
        case 3:

        if (student.isEmpty()) {
            System.out.println("No student present");
        }

        else{ 
            System.out.println("--------Student List--------");
            for(int i=0;i<=student.size();i++){
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
            break;

        default:
            System.out.println("Enter a valic choice");
            break;
      }
    


     
    }

    }
}


