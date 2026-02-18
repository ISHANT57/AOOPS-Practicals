public class City{
    private String name;
    private String country;
    private String timezone;


    public City(String name, String country, String timezone) {
        this.name = name;
        this.country = country;
        this.timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getTimezone() {
        return timezone;
    }

    public int hashCode(){
        return name.hashCode() + country.hashCode() + timezone.hashCode();

    }

    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';

}       }