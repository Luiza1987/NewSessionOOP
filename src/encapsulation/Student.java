package encapsulation;

public class Student {
   private  String name;
   private String lastName;
   private int age;
   private String[] courses;

   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getLastName() {
        return lastName;
   }
   public void setLastName(String lastName) {
        this.lastName = lastName;
   }
   public int getAge() {
        return age;
   }
   public void setAge(int age) {
        this.age = age;
   }

   public String[] getCourses() {
        return courses;
   }

   public void setCourses(String[] courses) {
        this.courses = courses;
   }


}
