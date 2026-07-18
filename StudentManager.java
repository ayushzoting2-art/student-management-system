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
      Student[] student = new Student[100];
      int count =0;
      System.out.println("=========================");
      System.out.println("     STUDENT MANAGER       "); 
      System.out.println("========================="); 
      System.out.println("Enter choice");
      System.out.println("1 To add student\n2 To delete\n3 To view\n4 To exit");
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
 
      student[count]=new Student(id,name, age, cgpa);
      count++;

      System.out.println("\nStudent Added Successfully!");
            break;
      
        case 2:
               for (int j = 0; j < count - 1; j++) {
            student[j] = student[j + 1];
        }
        student[count - 1] = null;
        count--;
        System.out.println("Student deleted.");
        break;
            
        
        case 3:
            for(int i=0;i<=count;i++){
                System.out.println(student[i].name);
                System.out.println(student[i].age);
                System.out.println(student[i].cgpa);
            }
            break;

        case 4:
            System.out.println("Thank You");
            break;

        default:
            System.out.println("Enter a valic choice");
            break;
      }


     
     sc.close();

    }
}


