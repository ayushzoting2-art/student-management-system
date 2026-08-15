import java.util.ArrayList;
import java.util.Scanner;


class Student {
    private int id; 
    private String name;
    private int age;
    private double cgpa;

    Student(int id,String name,int age, double cgpa){
        this.id=id;
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;


    }
    //ID
    public int getId(){
    return id;
    }
    public void setId(int id){
        
        this.id=id;
    }

    //Name
    public String getName(){
    return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
        //CG
    public double getCg(){
    return cgpa;
    }
    
    public void setCg(double cgpa){
        this.cgpa=cgpa;
    }
        //Age
    public int getAge(){
    return age;
    }
    
    public void setAge(int age){
        this.age=age;
    } 

    }



public class StudentManager {

//Add Student
void AddStudent(Scanner sc, ArrayList<Student> students){
System.out.println("Enter ID");
      int id =sc.nextInt();
      sc.nextLine();
      boolean exists = false;
      for (Student s : students) {
            if (s.getId()==id) {
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
      students.add(new Student(id, name, age, cgpa));
      
      System.out.println("\nStudent Added Successfully!");
      
      }
     }
    }


    //Delete Student
    void DeleteStudent(Scanner sc, ArrayList<Student> students){
        if (students.isEmpty()) {
        System.out.println("Not Student to Delete");
        return;
    }

    System.out.println("Enter Student ID to be removed:");
    int toremove = sc.nextInt();
    
    boolean found=false;
    for(int i=0;i<students.size();i++){
        if(students.get(i).getId()==toremove){
            students.remove(i);
            found=true;
            System.out.println("Removed students succesfully");
            break;
        }
    }

    if (!found) {
        System.out.println("Student not found");
    }
    }

    //View Students
    void ViewStudents(ArrayList <Student> students){
                if (students.isEmpty()) {
            System.out.println("No students present");
        }

        else{ 
            System.out.println("--------Student List--------");
            for(Student s : students){
                System.out.println("ID: "+s.getId());
                System.out.println("Name: "+s.getName());
                System.out.println("Age: "+s.getAge());
                System.out.println("CGPA: "+s.getCg());
                System.out.println("==========================");
            }
        }

    }

    //Update Students
    void UpdateStudents(ArrayList<Student>students, Scanner sc){
        boolean ufound=false;

        System.out.println("Enter students id of students to be updated");
        int  nid= sc.nextInt();
        sc.nextLine();
        for(Student s: students){
            if(nid==s.getId()){
                ufound=true;
                System.out.println("Enter New name");
                String newName = sc.nextLine();

                System.out.println("Enter New age");
                int newAge = sc.nextInt();

                System.out.println("Enter New CGPA");
                double newCgpa = sc.nextDouble();
                sc.nextLine();

                if (newAge <= 0 || newCgpa < 0 || newCgpa > 10) {               
                    System.out.println("Invalid input.");
                } else {

                    s.setName(newName);
                    s.setAge(newAge); 
                    s.setCg(newCgpa);
                    System.out.println("Student updated successfully.");
                }
                
            }
          
        }
         if (!ufound) {           
                System.out.println("Student ID not found.");
            }
    }

    //Search Student by id
    void SearchStudent(Scanner sc, ArrayList<Student> students) {

    if (students.isEmpty()) {
        System.out.println("No students present");
        return;
    }

    System.out.println("Enter Student ID to be searched");
    int sid = sc.nextInt();

    boolean found = false;

    for (Student s : students) {
        if (sid == s.getId()) {
            found = true;

            System.out.println("ID of Student is: " + s.getId());
            System.out.println("Name of Student is: " + s.getName());
            System.out.println("Age of Student is: " + s.getAge());
            System.out.println("CGPA of Student is: " + s.getCg());

            break;
        }
    }

    if (!found) {
        System.out.println("Student not found");
    }

}

    public static void main(String[] args) {
      int choice;
      Scanner sc=new Scanner(System.in);
      ArrayList<Student> students = new ArrayList<>();

     Manager manager = new Manager();
   

      while(true){
      System.out.println("=========================");
      System.out.println("     STUDENT MANAGER       "); 
      System.out.println("========================="); 
      System.out.println("Enter choice");
      System.out.println("1 Add students\n2 Delete\n3 View all students\n4 Update Student\n5 Search Student by ID\n6 Exit");
      choice = sc.nextInt();
      
     
      switch (choice) {
      case 1: manager.AddStudent(sc, students);
         break;

      
        case 2:manager.DeleteStudent(sc, students);
    
        break;
            

   
        case 3:manager.ViewStudents(students);
            break;
        

        case 4:manager.UpdateStudents(students, sc);
            break;

        case 5: manager.SearchStudent(sc,students);
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

