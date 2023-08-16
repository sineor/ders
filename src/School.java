import java.time.LocalDate;

public class School extends EDUCATIONCENTER{
    public School(String name, String locatedcountry, LocalDate founddationYear) {
        super(name, locatedcountry, founddationYear);
    }

    @Override
    public String getSudent() {
        return "School";
    }
}
