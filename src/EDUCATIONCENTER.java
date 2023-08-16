import java.time.LocalDate;

public abstract class EDUCATIONCENTER {
    private String name;
    private String locatedcountry;
    private LocalDate founddationYear;

    public EDUCATIONCENTER(String name, String locatedcountry, LocalDate founddationYear) {
        this.name = name;
        this.locatedcountry = locatedcountry;
        this.founddationYear = founddationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedcountry() {
        return locatedcountry;
    }

    public void setLocatedcountry(String locatedcountry) {
        this.locatedcountry = locatedcountry;
    }

    public LocalDate getFounddationYear() {
        return founddationYear;
    }

    public void setFounddationYear(LocalDate founddationYear) {
        this.founddationYear = founddationYear;
    }

    public abstract String getSudent();

    @Override
    public String toString() {
        return "EDUCATIONCENTER{" +
                "name='" + name + '\'' +
                ", locatedcountry='" + locatedcountry + '\'' +
                ", founddationYear=" + founddationYear +
                '}';
    }
}



