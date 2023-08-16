import java.time.LocalDate;

public class College extends EDUCATIONCENTER{
    public College(String name, String locatedcountry, LocalDate founddationYear) {
        super(name, locatedcountry, founddationYear);
    }

    @Override
    public String getSudent() {
        return "College";
    }
}
