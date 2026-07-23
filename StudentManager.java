import java.util.ArrayList;
import java.util.Scanner;


class Student {
    int id; 
    String name;
    int age;
    double cgpa;

    Student(int id,String name,int age, double cgpa){
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
      System.out.println("1 Add student\n2 Delete\n3View all students\n4 Update Student\n5 Exit");
      choice = sc.nextInt();
      
     
      switch (choice) {
      case 1:
         
      System.out.println("Enter ID");
      int id =sc.nextInt();
      sc.nextLine();
      boolean exists = false;

      for (Student s : student) {
            if (s.id==id) {
                System.out.println("ID already exists");
                exists=true;
                break;
            }
        }
     if (!exists) {
        
     
      System.out.println("Enter Name");
      String name=sc.nextLine();

      System.out.println("Enter age");
      int age = sc.nextInt();

      System.out.println("Enter CGPA");
      double cgpa = sc.nextDouble();
      sc.nextLine();

      if (age<=0 || cgpa<0 || cgpa>10) {
        System.out.println("Invalid Input");
      }
      else{
      student.add(new Student(id, name, age, cgpa));
      
      System.out.println("\nStudent Added Successfully!");
      
      }
     }
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
            for(Student s : student){
                System.out.println("ID: "+s.id);
                System.out.println("Name: "+s.name);
                System.out.println("Age: "+s.age);
                System.out.println("CGPA: "+s.cgpa);
                System.out.println("--------------------------");
            }
        }
            break;
        

        case 4:
            boolean ufound=false;

        System.out.println("Enter student id of student to be updated");
        int  nid= sc.nextInt();
        sc.nextLine();
        for(Student s: student){
            if(nid==s.id){
                ufound=true;
                System.out.println("Enter New name");
                String Nname=sc.nextLine();
                s.name=Nname;

                System.out.println("Enter New age");
                int Nage = sc.nextInt();
                s.age=Nage;

                System.out.println("Enter New cgpa");
                double Ncgpa=sc.nextDouble();
                s.cgpa=Ncgpa;

                    if (s.age <= 0 || s.cgpa < 0 || s.cgpa > 10) {
                    System.out.println("Invalid input.");
                    } else {
                    System.out.println("Student updated successfully.");
                    }
                
            }
          
        }
         if (!ufound) {
                
            
                System.out.println("Student ID not found.");
            }
            break;

        case 5:
            System.out.println("Thank You");
               sc.close();
            return;

        default:
            System.out.println("Enter a valid choice");
            break;
      }
    


     
    }

    }
}


