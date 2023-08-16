import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void main(String[] args) {
      EDUCATIONCENTER school = new School("Shkola 21", "ahunbaeva 21", LocalDate.of(1993, 3, 21));
      EDUCATIONCENTER univer = new Universitty("Univer imeni Jandara Krasavchika", "kluchevaya 70", LocalDate.of(2020, 8, 28));
      EDUCATIONCENTER college = new College("Koleg imeni Koli", "Kolya 51", LocalDate.of(2016, 5, 21));
      Student student = new Student("Nurles", "Subanbaev", "Man", LocalDate.of(2020, 8, 17), school);
      Student student1 = new Student("Jandar", "Taalaybekov", "Man", LocalDate.of(2020, 8, 17), univer);
      Student student2 = new Student("Erkin", "Toigonbaev", "Man", LocalDate.of(2020, 8, 17), college);
      Student student3 = new Student("Myrzaly", "Baimuratov", "Man", LocalDate.of(2020, 8, 17), univer);
      Student student4 = new Student("Adilet", "Mamyrbekov", "Man", LocalDate.of(2020, 8, 17), college);
      Student student5 = new Student("Narmat", "Kushnazarov", "Man", LocalDate.of(2020, 8, 17), school);
      Student student6 = new Student("Joomart", "Nurdoolotov", "Man", LocalDate.of(2020, 8, 17), college);
      Student student7 = new Student("Erbol", "Cholponov", "Man", LocalDate.of(2020, 8, 17), univer);
      Student student8 = new Student("Aziret", "Bekenov", "Man", LocalDate.of(2020, 8, 17), school);
      Student student9 = new Student("Arslan", "Tologonov", "Man", LocalDate.of(2020, 8, 17), univer);
      Student[] students = {student, student1, student2, student3, student4, student6, student7, student8, student5, student9};
      method(students);

   }
      public static void method (Student[] students){
         for(Student student : students){
            System.out.println("---------------------------------------------");
            System.out.println("Student's name:\n"+ student.getFirstName());
            System.out.println("Student's sur name:\n"+ student.getLastName());
            System.out.println("Student's gender:\n"+ student.getGender());
            System.out.println("Student's date of start:\n"+student.getStartDate());
            System.out.println("Student's education center:\n"+student.getEducationcenter().getSudent());
            System.out.println("Student's cours year:\n"+student.getYearsOfStuden());
            System.out.println("---------------------------------------------");


      }
   }
}









