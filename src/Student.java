import java.time.LocalDate;
import java.time.Period;
class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate startDate;
    private EDUCATIONCENTER educationcenter;

    public Student(String firstName, String lastName, String gender, LocalDate startDate, EDUCATIONCENTER educationcenter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.startDate = startDate;
        this.educationcenter = educationcenter;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public EDUCATIONCENTER getEducationcenter() {
        return educationcenter;
    }

    public void setEducationcenter(EDUCATIONCENTER educationcenter) {
        this.educationcenter = educationcenter;
    }

    public int getYearsOfStuden() {
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear() - startDate.getYear();
        return year;
    }
}









