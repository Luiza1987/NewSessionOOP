package constructor;

public class Course {
    String cuorseName;
    String instructor;
    Student[]students;

   public  Course(String courseName, String instructor, Student[]students){
       if (courseName.length() <= 1) {
            System.out.println("Атын туура жазыныз: ");
        } else {
           this.cuorseName = courseName;
           this.instructor = instructor;
           this.students = students;
        }
       }

   }


