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

//Add Student
void addstudent(Scanner sc, ArrayList<Student> student){
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
    }


    //Delete Student
    void deletestudent(Scanner sc, ArrayList<Student> student){
        if (student.isEmpty()) {
        System.out.println("Not Student to Delete");
        return;
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
    }

    //View Students
    void viewstudents(ArrayList <Student> student){
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
                System.out.println("==========================");
            }
        }
    }

    //Update Students
    void updatestudents(ArrayList<Student>student, Scanner sc){
        boolean ufound=false;

        System.out.println("Enter student id of student to be updated");
        int  nid= sc.nextInt();
        sc.nextLine();
        for(Student s: student){
            if(nid==s.id){
                ufound=true;
                System.out.println("Enter New name");
                s.name = sc.nextLine();

                System.out.println("Enter New age");
                int newAge = sc.nextInt();

                System.out.println("Enter New CGPA");
                double newCgpa = sc.nextDouble();

                if (newAge <= 0 || newCgpa < 0 || newCgpa > 10) {               
                    System.out.println("Invalid input.");
                } else {
                    s.age = newAge;
                    s.cgpa = newCgpa;
                    System.out.println("Student updated successfully.");
                }
                
            }
          
        }
         if (!ufound) {           
                System.out.println("Student ID not found.");
            }
    }

    //Search Student by id
    void searchstudent(Scanner sc, ArrayList <Student> student){
        boolean stat = false;
        if(student.isEmpty()){
            stat=true;
            System.out.println("No student present");
            return;
        }


        System.out.println("Enter Student ID to be searched");
        int sid=sc.nextInt();
       boolean found = false;
        if (!stat) {
            
        
        for(Student s: student){
            if (sid==s.id) {
                found = true;
                System.out.println("ID of Student is:"+s.id);
                System.out.println("Name of Student is:"+s.name);
                System.out.println("CGPA of Student is:"+s.cgpa);
                
            }
        }
        if(!found){
            System.out.println("Student not found");
        }
    }
    }

    public static void main(String[] args) {
      int choice;
      Scanner sc=new Scanner(System.in);
      ArrayList<Student> student = new ArrayList<>();

     StudentManager manager = new StudentManager();
   

      while(true){
      System.out.println("=========================");
      System.out.println("     STUDENT MANAGER       "); 
      System.out.println("========================="); 
      System.out.println("Enter choice");
      System.out.println("1 Add student\n2 Delete\n3View all students\n4 Update Student\n5 Search Student by ID\n6 Exit");
      choice = sc.nextInt();
      
     
      switch (choice) {
      case 1: manager.addstudent(sc, student);
         break;

      
        case 2:manager.deletestudent(sc, student);
    
        break;
            

   
        case 3:manager.viewstudents(student);
            break;
        

        case 4:manager.updatestudents(student, sc);
            break;

        case 5: manager.searchstudent(sc,student);
            break;

        case 6:
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


