import java.time.LocalDate;

public class Universitty extends EDUCATIONCENTER{
    public Universitty(String name, String locatedcountry, LocalDate founddationYear) {
        super(name, locatedcountry, founddationYear);
    }

    @Override
    public String getSudent() {
        return "University";
    }
}
